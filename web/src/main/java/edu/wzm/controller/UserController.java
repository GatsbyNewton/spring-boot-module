package edu.wzm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import edu.wzm.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangzhiming
 * @Date: 2020/10/30
 * @version:
 * @Description:
 */
@RestController
public class UserController {
    public static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(@RequestParam(value = "gender", defaultValue = "1") int gender) {
        return JSON.toJSONString(userService.getUserInfo(gender),
                SerializerFeature.WriteMapNullValue);
    }
}
