package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component

public class Alien {

    @Value("33")
    private int age;
    @Value("332")
    private int marks;

    //private Laptop lap;


    @Qualifier("com2")
    private Computer com;

    public Alien(){
        System.out.println("Alien object is created");
    }

//    public Alien(int age){
//        this.age= age;
//        System.out.println("Alien para constructor called");
//    }

/*
    @ConstructorProperties({"age","lap","marks"})
    public Alien(int age, Laptop lap, int marks) {
        this.age = age;
        this.marks = marks;
        this.lap = lap;
        System.out.println("Alien para constructor called");
    }




    public void code(){
        System.out.println("coding");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }


 */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Assign via setter called setter injection");
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("com2")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}

