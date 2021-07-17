package com.Scaler.Homework.Day8;

import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        //1 2 3 4 5
        // 2 3 8 15 20
        int x = A.length;
        int[] B = new int[x];
        if (B.length == 0) {
            System.out.println(0);
            ;
        } else if (B.length == 1) {
            System.out.println(A[0]);
            ;
        }
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                B[i] = A[i] * A[i + 1];
            } else if (i == x - 1) {
                B[i] = A[x - 1] * A[x - 2];
            } else {
                B[i] = A[i - 1] * A[i + 1];
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}