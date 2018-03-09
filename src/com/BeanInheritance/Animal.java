package com.BeanInheritance;

public class Animal {

    protected String name;
    protected String food;
    protected String sound;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void eat(){
        System.out.println("The Animal " + name + " likes to eat " + food + '.');
    }
    public void makeSound(){
        System.out.println(name + " the Animal sounds like: " + sound);
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
