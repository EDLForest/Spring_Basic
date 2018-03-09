package com.BeanInheritance;

public class Shark extends Animal {

    public void eat(){
        System.out.println(name + " the Shark likes to eat " + food + '.');
    }

    public void makeSound(){
        System.out.println(name + " the Shark sounds like: " + sound);
    }
}
