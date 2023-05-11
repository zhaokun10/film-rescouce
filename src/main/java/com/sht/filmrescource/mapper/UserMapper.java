package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Film;
import com.sht.filmrescource.entity.User;

import java.util.List;

public interface UserMapper {

   User findUserByUserName(String username);

   int updateUserInfoByUserId(User user);

   int insertUser( User user);

   int deleteUserByUserId(Long userId);

   User findUserByUserId(Long userId);

   List<User> queryAllUser();

   int insertUserRole(Long userId, Long roleId);
   int deleteUserRole(Long userId);

   Integer insertUserCollect(Long userId, Long filmId);

   List<Film> queryAllUserCollect(Long userId);
}
