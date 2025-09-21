package com.telusko.spring_sec_demo.controller;

import com.telusko.spring_sec_demo.model.User;
import com.telusko.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }


    @PostMapping("register")
    public User Register(@RequestBody User user){

        return userService.addUser(user);
    }
}
