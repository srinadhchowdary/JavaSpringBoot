package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Starting Tomcat...");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9999); // set port

        // create context
        Context context = tomcat.addContext("", null);

        // register servlet
        tomcat.addServlet(context, "HelloServlet", new HelloServlet());

        // map servlet
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}
