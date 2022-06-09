package com.tuzhi.service.user;

import com.tuzhi.pojo.User;
import com.tuzhi.dao.user.UserMapper;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 18:19
 **/

public class UserServiceImpl implements UserService {
    private UserMapper UserMapper;

    public void setUserMapper(UserMapper UserMapper) {
        this.UserMapper = UserMapper;
    }

    @Override
    public int addUser(User User) {
        return UserMapper.addUser(User);
    }

    @Override
    public int deleteUser(Integer id) {
        return UserMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User User) {
        return UserMapper.updateUser(User);
    }

    @Override
    public User selectUserById(Integer id) {
        return UserMapper.selectUserById(id);
    }

    @Override
    public List<User> selectUser() {
        return UserMapper.selectUser();
    }
}
