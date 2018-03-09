package com.BeanPostProcessing;

public class HelloWorld {

    private String message;

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

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
