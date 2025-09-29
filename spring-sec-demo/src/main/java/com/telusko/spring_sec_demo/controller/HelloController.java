package com.telusko.spring_sec_demo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("hello")
    public String greet(HttpServletRequest request){
//        return "Hello worlds: "+ request.getSession().getId();
        return "Hello World";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "SRINADH : " + request.getSession().getId();
    }
}
