package com.DSApractice.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = 0;
        fact = n * factorial(n - 1);
        return fact;
    }
}
