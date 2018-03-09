package com.Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/Scopes/SingletonBeans.xml");

        SingletonExample prototype1 = (SingletonExample) context.getBean("NotSingle");
        SingletonExample prototype2 = (SingletonExample) context.getBean("NotSingle");

        SingletonExample single1 = (SingletonExample) context.getBean("single");
        SingletonExample single2 = (SingletonExample) context.getBean("single");

        single1.setMessage("I am single1");
        System.out.println("Single1 message: " + single1.getMessage());
        System.out.println("Single2 message: " + single2.getMessage());

        prototype1.setMessage("I am not singleton");
        System.out.println("prototype1 message: " + prototype1.getMessage());
        System.out.println("prototype2 message: " + prototype2.getMessage());
    }
}
