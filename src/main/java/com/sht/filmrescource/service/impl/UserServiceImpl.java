package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Film;
import com.sht.filmrescource.entity.User;
import com.sht.filmrescource.mapper.UserMapper;
import com.sht.filmrescource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
                userMapper.deleteUserRole(userId);
        return userMapper.deleteUserByUserId(userId);
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userMapper.findUserByUserId(userId);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public int insert(User user) {
        userMapper.insertUser(user);
        User newUser = userMapper.findUserByUserName(user.getUsername());
        return userMapper.insertUserRole(newUser.getUserId(), 2L);
    }

    @Override
    public Boolean insertUserCollect(Long userId, Long filmId) {
        return userMapper.insertUserCollect(userId, filmId)>0;
    }

    @Override
    public List<Film> queryAllUserCollect(Long userId) {
        return userMapper.queryAllUserCollect(userId);
    }
}
