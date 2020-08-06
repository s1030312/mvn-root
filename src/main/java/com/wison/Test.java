package com.wison;

import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;

public class Test {

    public static void main(String[] args) {
        try {
            SpringApplication.run();
        } catch (LifecycleException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

}
