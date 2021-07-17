package com.Scaler.Assignment.Day15;

import java.util.Scanner;

public class AQuestion2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N : ");
        int n = sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
