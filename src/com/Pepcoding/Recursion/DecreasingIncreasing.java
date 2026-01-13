package com.Pepcoding.Recursion;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingIncreasing(n);
    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }
}
