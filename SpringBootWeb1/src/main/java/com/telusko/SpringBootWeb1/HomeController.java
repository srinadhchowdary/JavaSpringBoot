package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        System.out.println("srinadh hello");
        return "index.jsp";

    }
}
