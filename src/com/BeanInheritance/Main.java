package com.BeanInheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String[] args){
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("com/BeanInheritance/AnimalBeans.xml");

        Animal animal = (Animal) context.getBean("animal");
        Animal cat = (Animal) context.getBean("cat");
        Animal kitten = (Animal) context.getBean("kitten");
        Animal shark = (Animal) context.getBean("shark");

        animal.eat();
        cat.eat();
        kitten.eat();
        shark.eat();

        animal.makeSound();
        cat.makeSound();
        kitten.makeSound();
        shark.makeSound();
    }
}
