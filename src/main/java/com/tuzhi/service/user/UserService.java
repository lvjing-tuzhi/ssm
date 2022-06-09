package com.tuzhi.service.user;

import com.tuzhi.pojo.Book;
import com.tuzhi.pojo.User;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 18:19
 **/

public interface UserService {
    //    添加用户
    int addUser(User user);
    //    删除用户
    int deleteUser(Integer id);
    //    修改用户
    int updateUser(User user);
    //    查找用户根据ID
    User selectUserById(Integer id);
    //    查找所有的用户
    List<User> selectUser();
}
