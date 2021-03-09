package edu.wzm.impl;

import edu.wzm.dao.master.UserDao;
import edu.wzm.entity.User;
import edu.wzm.service.UserService;
import edu.wzm.vo.UserVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author: wangzhiming
 * @Date: 2020/10/30
 * @version:
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    public static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    public List<UserVo> getUserInfo(int gender) {
        List<User> users = userDao.selectByGender(gender);
        Random random = new Random();

        return users.stream()
                .parallel()
                .map(user -> new UserVo(user.getName(), user.getGender(), random.nextFloat()))
                .collect(Collectors.toList());
    }
}
