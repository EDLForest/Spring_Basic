package com.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String [] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/HelloWorld/HelloWorldBeans.xml");

        HelloWorld hello = (HelloWorld) context.getBean("hello1");
        System.out.println(hello.getMessage());
    }
}
