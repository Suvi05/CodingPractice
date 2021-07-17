package com.Scaler.Assignment.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class AQuestion1 {
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

    public static int[] solve(int[] A) {
        Arrays.sort(A);
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        return B;
    }
}
