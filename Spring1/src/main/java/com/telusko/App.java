package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj  = context.getBean(Alien.class);

        //obj.setCom(new Desktop());
        System.out.println(obj.getAge());
        System.out.println(obj.getMarks());

        obj.code();

        /*
        Desktop dt = context.getBean("Desktop",Desktop.class);

        dt.compile();

        Desktop dt1 = context.getBean("Desktop",Desktop.class);
        dt1.compile();

         */


        /*
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        //take reference of the object in container
//        Alien obj = (Alien) context.getBean("alien");

        Alien obj  = context.getBean("alien",Alien.class);

        System.out.println(obj.getAge());
        //System.out.println(obj.getMarks());

        obj.code();

//        Laptop obj2 = context.getBean(Laptop.class);

//        Desktop obj1= (Desktop) context.getBean("desktop");
        Desktop obj1 = context.getBean(Desktop.class);





//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);



         */

    }
}
