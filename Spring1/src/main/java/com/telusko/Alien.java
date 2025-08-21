package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private int marks;

    private Laptop lap;

    public Alien(){
        System.out.println("Alien object is created");
    }

//    public Alien(int age){
//        this.age= age;
//        System.out.println("Alien para constructor called");
//    }


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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}

