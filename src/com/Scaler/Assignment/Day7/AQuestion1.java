package com.Scaler.Assignment.Day7;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int X = A[0];
        for (int i = 0; i < n; i++) {
            X = X ^ A[i];
        }
        System.out.print(X + " ");
    }
}
