package com.telusko.app.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    @Value("32")
    private int age;
//    Laptop lap;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    //@Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
       // System.out.println("Hello world");
        com.compile();
    }
}
