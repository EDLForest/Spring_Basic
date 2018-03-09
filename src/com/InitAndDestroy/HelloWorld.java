package com.InitAndDestroy;

public class HelloWorld {

    private String message;

    public void defInit(){
        System.out.println("-- Creating a HelloWolrd Object with default init");
    }
    public void defDestroy(){
        System.out.println("--- Destroying a HelloWorld Object with default destroy");
    }

    public void init(){
        System.out.println("--- Creating a HelloWorld Object ---");
    }

    public void destroy(){
        System.out.println("--- Destroying a HelloWorld Object ---");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
