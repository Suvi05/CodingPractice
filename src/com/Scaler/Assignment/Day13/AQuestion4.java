package com.Scaler.Assignment.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class AQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int res = 0;
        Arrays.sort(A);
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] == A[i] - A[i - 1]) {
                res = 1;
            } else {
                res = 0;
            }
        }
        return res;
    }
}
//-113 -70 -14 -8 -29 5 -94 -44 23 9 13 -132 -14