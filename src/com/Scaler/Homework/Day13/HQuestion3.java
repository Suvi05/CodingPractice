package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int minSteps = 0;
        for (int j = 0; j < A.length; j++) {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] != A[i + 1]) {
                    minSteps += 0;
                } else {
                    A[i] = A[i] + 1;
                    minSteps += 1;
                }
            }
        }
        return minSteps;
    }
}
