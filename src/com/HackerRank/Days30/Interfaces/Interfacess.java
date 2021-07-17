package com.HackerRank.Days30.Interfaces;

import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    int num = 0;

    public int divisorSum(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num += i;
            }
        }
        return num;
    }
}

public class Interfacess {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}