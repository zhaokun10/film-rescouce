package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.mapper.UserMapper;
import com.sht.filmrescource.model.User;
import com.sht.filmrescource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        User loginUser = userMapper.findUserByUserName(user.getUsername());
        if(Objects.nonNull(loginUser)&&Objects.equals(loginUser.getPassword(),user.getPassword())){
            return loginUser;
        }
        return null;
    }

    @Override
    public int updateUserInfoByUserId(User user) {
        return userMapper.updateUserInfoByUserId(user);
    }

    @Override
    public int register(User user) {
        User loginUser = userMapper.findUserByUserName(user.getUsername());
        if(Objects.isNull(loginUser)){
            return userMapper.insertUser(user);
        }
        return 0;
    }

    @Override
    public int deleteUserByUserId(Long userId) {
        return userMapper.deleteUserByUserId(userId);
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userMapper.findUserByUserId(userId);
    }
}
