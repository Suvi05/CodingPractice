package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the B : ");
        int B = sc.nextInt();

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int finalDiff = 0;
        int maxFreq = 0;
        int minFreq = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int l = A[A.length - 1];
            int s = A[0];

            if (A[i] == A[A.length - 1]) {
                maxFreq++;
            } else if (A[i] == A[0]) {
                minFreq++;
            }
            while (B != 0) {
                if (maxFreq < minFreq) {
                    if (B < maxFreq) {
                        break;
                    } else {
                        B -= maxFreq;
                        A[A.length - 1] = A[A.length - 1] - 1;
                    }
                } else if (maxFreq > minFreq) {
                    //Increment
                    if (B < minFreq) {
                        break;
                    } else {
                        B -= minFreq;
                        A[0] = A[0] + 1;
                    }
                }
            }
            finalDiff = l - s;
        }
        return finalDiff;
    }
}
