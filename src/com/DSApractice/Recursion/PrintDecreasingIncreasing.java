package com.DSApractice.Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

}
