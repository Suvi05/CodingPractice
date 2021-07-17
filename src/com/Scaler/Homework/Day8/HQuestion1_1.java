package com.Scaler.Homework.Day8;

import java.util.Scanner;

public class HQuestion1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[m];
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        int n = A.length;
        int carry = 1;
        int i = 0;
        for (i = n - 1; i >= 0; i--) {
            int sum = A[i] + carry;
            A[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] x = new int[n + 1];
            x[0] = 1;
            for (int val : x) {
                System.out.println(val);
            }
        }
        i = 0;
        while (A[i] == 0) i++;
        int[] x = new int[n - i];

        int a = 0;
        for (; i < n; i++) x[a++] = A[i];

        for (int val : x) {
            System.out.println(val);
        }
    }
}
