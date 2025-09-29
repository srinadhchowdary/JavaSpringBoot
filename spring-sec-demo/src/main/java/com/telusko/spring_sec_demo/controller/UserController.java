package com.telusko.spring_sec_demo.controller;

import com.telusko.spring_sec_demo.model.User;
import com.telusko.spring_sec_demo.service.JwtService;
import com.telusko.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }


    @PostMapping("register")
    public User Register(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
            );

            if (authentication.isAuthenticated()) {
//                return "Success";
                return jwtService.generateToken(user.getUsername());
            }
        } catch (BadCredentialsException e) {
            return "Invalid username or password";
        } catch (Exception e) {
            return "Authentication failed: " + e.getMessage();
        }

        return "oops"; // fallback
    }



}
