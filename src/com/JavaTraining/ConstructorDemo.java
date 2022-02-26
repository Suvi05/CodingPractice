package com.JavaTraining;

public class ConstructorDemo {
    static ConstructorDemo obj;
    public static void main(String[] args) {
        new ConstructorDemo(); //Option -1

        obj= new ConstructorDemo(); //Option -2  //Mostly 99.99%
        //--> Object Reference
    }
    ConstructorDemo(){
        System.out.println("Constructor");
    }
}
