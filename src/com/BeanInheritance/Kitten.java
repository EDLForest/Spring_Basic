package com.BeanInheritance;

public class Kitten extends Animal {

    @Override
    public void eat() {
        System.out.println(name + " the Kitten likes to eat " + food + '.');
    }

    public void makeSound(){
        System.out.println(name + " the Kitten sounds like: " + sound);
    }
}
