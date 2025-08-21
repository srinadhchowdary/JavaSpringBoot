package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        //take reference of the object in container
        Alien obj = (Alien) context.getBean("alien");

        System.out.println(obj.getAge());
        System.out.println(obj.getMarks());

        obj.code();





//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);



    }
}
