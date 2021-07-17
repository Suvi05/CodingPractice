package com.Scaler.Assignment.Day13;

import java.util.Scanner;

public class AQuestion1_1 {
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
        int[] result = new int[A.length];
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count0++;
            } else if (A[i] == 1) {
                count1++;
            } else if (A[i] == 2) {
                count2++;
            }
        }
        if (A.length == 1) {
            result[0] = A[0];
        } else {
            for (int i = 0; i < count0; i++) {
                result[i] = 0;
            }
            for (int i = count0; i < (count1 + count0); i++) {
                result[i] = 1;
            }
            for (int i = (count1 + count0); i < (count2 + count1 + count0); i++) {
                result[i] = 2;
            }
        }
        return result;
    }
}
