package com.Scaler.Assignment.Day19;

import java.util.Scanner;

//My Approach
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
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int n = A.length;
        int[] Prefix = new int[n];

        Prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            Prefix[i] = Prefix[i - 1] + A[i];
        }

        for (int i = 0; i < n; i++) {
            int Lsum = Prefix[i] - A[i];
            int Rsum = Prefix[n - 1] - Prefix[i];
            if (Lsum == Rsum) {
                return i;
            }
        }
        return -1;
    }
}
