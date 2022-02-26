package com.JavaTraining.Constructor;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println("Main");
        new ParameterizedConstructor("Sumit");
    }
    ParameterizedConstructor(String name){ //Parameterized Constructor -->User Define
        System.out.println("Parameterized Constructor");
    }
}
