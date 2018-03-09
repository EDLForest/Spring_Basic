package com.BeanInheritance;

public class Cat extends Animal {

    public void eat(){
        System.out.println(name + " the Cat likes to eat " + food + '.');
    }

    public void makeSound(){
        System.out.println(name + " the Cat sounds like: " + sound);
    }
}
