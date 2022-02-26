package com.JavaTraining.Constructor;

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Main");
        new DefaultConstructorDemo();
    }

    DefaultConstructorDemo(){ //Default Constructor
        super();
    }
}
