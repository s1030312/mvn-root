package com.wison;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class SpringApplication {

    public static void run() throws LifecycleException, ServletException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9999);
        tomcat.addWebapp("/","/Users/ufenqi/web/");
        tomcat.start();
        tomcat.getServer().await();
    }

}
