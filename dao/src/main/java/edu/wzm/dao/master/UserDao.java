package edu.wzm.dao.master;

import edu.wzm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: wangzhiming
 * @Date: 2020/10/30
 * @version:
 * @Description:
 */
public interface UserDao {

    List<User> selectByGender(@Param("gender") int gender);
}
