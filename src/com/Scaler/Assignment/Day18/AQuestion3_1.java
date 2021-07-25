package com.Scaler.Assignment.Day18;

import java.util.HashSet;
import java.util.Scanner;

public class AQuestion3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the Value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int[] C = new int[A.length];

        C[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            C[i] = C[i - 1] + A[i];
        }

        int max = C[B - 1];
        if (A.length == B) {
            return max;
        }
        int i = 0;
        for (; i < B; i++) {
            if (i == 0) {
                max = Math.max(max, C[A.length - 1] - C[A.length - 1 - B]);
            } else max = Math.max(max, C[i - 1] + (C[A.length - 1] - C[A.length - 1 - (B - i)]));

        }
        return max;
    }
}
