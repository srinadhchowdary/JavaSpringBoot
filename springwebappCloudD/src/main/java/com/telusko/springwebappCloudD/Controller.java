package com.telusko.springwebappCloudD;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/")
    public String greet(){
        return "Welcome to world..!!";
    }

    @RequestMapping("/info")
    public String aboutMachine(){
        String os = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String user = System.getProperty("user.name");

        return "OS : "+os+", Version : "+version+", architecture: "+architecture+", JavaVersion: "+javaVersion+", user: "+user;
    }
}
