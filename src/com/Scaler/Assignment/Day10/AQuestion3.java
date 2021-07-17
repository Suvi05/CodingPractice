package com.Scaler.Assignment.Day10;

import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N :");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            int j = n - 1;
            for (int val = 1; val <= i + 1; val++) {
                A[i][j] = val;
                j--;
            }
         }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
}
