package com.Scaler.Homework.Day8;

import java.util.Scanner;

public class HQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        int mcount = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 2; j <= A[i]; j++) {
                if (A[i] > 0) {
                    if (A[i] % j == 0) {
                        count++;
                    }
                }
            }
            if (count >0 && count < 2) {
                mcount++;
            }
            count = 0;
        }
        System.out.println(mcount);
    }
}