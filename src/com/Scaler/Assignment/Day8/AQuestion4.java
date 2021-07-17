package com.Scaler.Assignment.Day8;

import java.util.Scanner;

public class AQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            sum += A[i];
        }
        int maximum = A.length * max;
        System.out.println(maximum - sum);
    }
}
