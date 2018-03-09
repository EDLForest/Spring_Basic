package com.InitAndDestroy;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String args []){
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("com/InitAndDestroy/Beans.xml");

        HelloWorld hello = (HelloWorld) context.getBean("hello");
        HelloWorld defHello = (HelloWorld) context.getBean("defHello");
        System.out.println(hello.getMessage());
        System.out.println(defHello.getMessage());
        context.registerShutdownHook();
    }
}
