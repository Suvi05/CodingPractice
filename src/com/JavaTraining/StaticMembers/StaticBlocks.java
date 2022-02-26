package com.JavaTraining.StaticMembers;

public class StaticBlocks {
    public static void main(String[] args) { //interpreted
        System.out.println("Hello World");
    }
    static{
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }
}
