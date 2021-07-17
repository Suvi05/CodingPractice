package com.Scaler.Assignment.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class AQuestion3 {
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
        Arrays.sort(A);
        if (A[A.length - 1] == 0) {
            return 1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                if ((A.length - i - 1) == (A[i])) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
//-4 -2 0 -1 -6
//-1 -2 0 0 0 -3
// -6 -1 4