package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int totalSum = 0;
        Arrays.sort(A);
        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        Arrays.sort(B, Collections.reverseOrder());
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                totalSum += B[j];
            }
            B[i] = 0;
        }
        return totalSum;
    }
}
