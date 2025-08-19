package com.telusko;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Student s1 = new Student();
        s1.setsName("ram");
        s1.setRollno(8);
        s1.setsAge(100);


//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.telusko.Student.class);
//        cfg.configure();

        SessionFactory sf = new Configuration()
                        .addAnnotatedClass(com.telusko.Student.class)
                        .configure()
                        .buildSessionFactory();

        Session session = sf.openSession();

    //Read data
        //Student s2 = new Student();
        // session.load(s2, 7);

/*
        //update record
        Transaction transaction = session.beginTransaction();
        session.merge(s1);
        transaction.commit();

 */

        /*
        //Create data

         //s2= session.getReference(Student.class,6);
         Transaction transaction = session.beginTransaction();
          session.persist(s1);
          transaction.commit();

         */

            //delete
/*
        Student s2 =new Student();
        session.load(s2, 8);
        Transaction transaction = session.beginTransaction();
        session.remove(s2);
        transaction.commit();



        System.out.println(s2);

        session.close();
        sf.close();
*/
/*

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("rag");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("xps");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3.setRam(8);


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAnmame("Srinadh");
        a1.setTech("Java");


        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAnmame("Raj");
        a2.setTech("python");

//        Alien a3 = new Alien();
//        a3.setAid(103);
//        a3.setAnmame("Naveen");
//        a3.setTech("c++");

        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));
        //a3.setLaptops(Arrays.asList(l1));

//        l1.setAliens(Arrays.asList(a1,a3));
//        l2.setAliens(Arrays.asList(a1,a2));
//        l3.setAliens(Arrays.asList(a2));


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Alien.class)
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
        //session.persist(a3);

        transaction.commit();



        //Alien a2 = session.getReference(Alien.class, a1.getAid());
        //a2 = session.getReference(Alien.class,108);

//        Alien a5 = new Alien();
//        a5 = session.getReference(Alien.class,a1.getAid());

        //System.out.println(a5);

        session.close();



        Session session1 = sf.openSession();
//        Alien a5 = new Alien();
//        session1.load(Alien.class,a1.getAid());

        //to get the query of select
        Alien a5 =session1.find(Alien.class, a1.getAid());

        //now will get the data of all bcoz lazy fetch not full details in query without this print
        System.out.println(a5);


        session1.close();

        sf.close();



 */

//        Laptop l1 = new Laptop();
//        l1.setLid(4);
//        l1.setBrand("Asus");
//        l1.setModel("strix");
//        l1.setRam(32);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

    /*
        //select * from Laptop where ram= 32; -> SQL
        //from Laptop where ram= 32; -> HQL

        //Query query = session.createQuery("from Laptop where ram = 32");

        String brand = "Asus";
        //Query query = session.createQuery("from Laptop where brand like ?1");
        //Query query = session.createQuery("select model from Laptop where brand like ?1");
        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
        query.setParameter(1,brand);
//        List<String> Laptops = query.getResultList();
        List<Object[]> laptops = query.getResultList();

        for (Object[] data : laptops){
            System.out.println((String) data[0] + " " + (String) data[1]);
        }

        System.out.println(laptops);




        //Laptop l1= new Laptop();
        //primary key based
        //l1 = session.getReference(Laptop.class,3);
//        System.out.println(l1);

     */


    /*
//        Laptop laptop = session.find(Laptop.class,2);
//        System.out.println(laptop);

//        Laptop laptop = new Laptop();
//        session.load(laptop, 2);
//        System.out.println(laptop);



     */


//L1 cache
        Laptop l1 = session.find(Laptop.class,2);
        System.out.println(l1);
        Laptop l2= session.find(Laptop.class,2);
        System.out.println(l2);

        session.close();
//L2 -cache

        Session session1 = sf.openSession();
        Laptop l3 = session1.find(Laptop.class,2);
        System.out.println(l3);
        session1.close();
        sf.close();




    }
}
