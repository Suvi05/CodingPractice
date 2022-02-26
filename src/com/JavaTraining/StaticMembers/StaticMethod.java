package com.JavaTraining.StaticMembers;

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        StaticMethod.method1();

    }
    static void method1() {
        System.out.println("Inside Static Method");
    }
    static{
        System.out.println("Static Block");
        StaticMethod.method1();
    }
}
