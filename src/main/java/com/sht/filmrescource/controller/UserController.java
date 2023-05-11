package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Film;
import com.sht.filmrescource.entity.User;
import com.sht.filmrescource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/user/insert")
    int insert(@RequestBody  User user){
        return userService.insert(user);
    }

    @GetMapping("/findUser")
    User findUserByUserId(@RequestParam Long userId){
        return userService.findUserByUserId(userId);
    }

    @GetMapping("/query")
    ResponseEntity<List<User>> queryAllUser(){
        return ResponseEntity.ok(this.userService.queryAllUser());
    }

    @PostMapping("/user/collect/{id}")
    ResponseEntity<Boolean> insertUserCollect(@PathVariable("id") Long userId, @RequestParam Long filmId){
        return ResponseEntity.ok( userService.insertUserCollect(userId, filmId));
    }
    @GetMapping("/user/collect//query")
    ResponseEntity<List<Film>> queryAllUserCollect(@RequestParam Long userId){
        return ResponseEntity.ok(this.userService.queryAllUserCollect(userId));
    }
}
