package com.Scaler.Assignment.Day18;

import java.util.HashSet;
import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        System.out.print("Enter the Value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int[] C = new int[A.length];

        for (int i = 0; i < B; i++) {
            C[i] = A[A.length - 1 - i];
        }
        int k = 0;
        for (int i = B; i < (2 * B); i++) {
            C[i] = A[k];
            k++;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < B; i++) {
            hs.add(C[i] + C[i + 1] + C[i + 2]);
        }
        int max = Integer.MIN_VALUE;
        for (int d : hs) {
            if (max > d) {
                max = d;
            }
        }
        return max;
    }
}

