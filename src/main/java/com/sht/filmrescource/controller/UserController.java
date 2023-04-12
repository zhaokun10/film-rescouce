package com.sht.filmrescource.controller;

import com.sht.filmrescource.model.User;
import com.sht.filmrescource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    User login(@RequestBody  User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    int register(@RequestBody  User user){
        return userService.register(user);
    }

    @PostMapping("/update")
    int updateUserInfoByUserId(@RequestBody  User user){
        return userService.updateUserInfoByUserId(user);
    }

    @PostMapping("/delete")
    int login(@RequestBody  Long userId){
        return userService.deleteUserByUserId(userId);
    }

    @GetMapping("/findUser")
    User findUserByUserId(@RequestParam Long userId){
        return userService.findUserByUserId(userId);
    }
}
