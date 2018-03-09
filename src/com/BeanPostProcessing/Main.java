package com.BeanPostProcessing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String args []){

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("com/BeanPostProcessing/BeanPrePostProcessing.xml");

        HelloWorld hello = (HelloWorld) context.getBean("hello");
        hello.getMessage();

        context.registerShutdownHook();
    }
}
