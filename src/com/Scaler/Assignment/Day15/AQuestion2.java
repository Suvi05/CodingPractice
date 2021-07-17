package com.Scaler.Assignment.Day15;

import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N : ");
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }

    public static int fibo(int n) {
        int fib = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib = fibo(n - 1) + fibo(n - 2);
    }
}
/*
* Day 15- Assignment Question-2
//Kth term of Fibonnaci Series
* */