package com.sht.filmrescource.service;

import com.sht.filmrescource.model.User;

public interface UserService {

    User login(User user);

    int updateUserInfoByUserId(User User);

    int register(User user);

    int deleteUserByUserId(Long userId);

    User findUserByUserId(Long userId);
}
