package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. Elements in A : ");
        int n = sc.nextInt();
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int output = 0;

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                if (A[i] > maxEven) {
                    maxEven = A[i];
                }
            } else {
                if (A[i] < minOdd) {
                    minOdd = A[i];
                }
            }
            output = maxEven - minOdd;
        }
        System.out.println(output);
    }
}
