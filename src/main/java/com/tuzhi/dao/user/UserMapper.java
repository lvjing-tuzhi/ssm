package com.tuzhi.dao.user;

import com.tuzhi.pojo.Book;
import com.tuzhi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: ssmbuild
 * @description: 用户dao层
 * @author: 兔子
 * @create: 2022-06-09 13:21
 **/

public interface UserMapper {
    //    添加用户
    int addUser(User user);
    //    删除用户
    int deleteUser(@Param("id") Integer id);
    //    修改用户
    int updateUser(User user);
    //    查找用户根据ID
    User selectUserById(@Param("id") Integer id);
    //    查找所有的用户
    List<User> selectUser();
}
