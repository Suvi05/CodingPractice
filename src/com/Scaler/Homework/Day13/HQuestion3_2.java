package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        if (A.length <= 1 || A == null) {
            return 0;
        }
        Arrays.sort(A);
        int minSteps = 0;
        int left = 0;
        int right = 1;
        while (left < A.length && right < A.length) {
            if (A[left] == A[right]) {
                right++;

                if (right == A.length) {
                    for (int j = 0; j < right - left; j++) {
                        minSteps += j;
                    }
                }
            } else {
                minSteps += right - left - 1;

                int i = left + 1;
                while (i < right) {
                    A[i]++;
                    i++;
                }

                left++;
                right = left + 1;
            }
        }
        return minSteps;
    }
}
