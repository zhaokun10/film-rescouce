package com.sht.filmrescource.mapper;

import com.sht.filmrescource.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

   User findUserByUserName(String username);

   int updateUserInfoByUserId(User user);

   int insertUser( User user);

   int deleteUserByUserId(Long userId);

   User findUserByUserId(Long userId);
}
