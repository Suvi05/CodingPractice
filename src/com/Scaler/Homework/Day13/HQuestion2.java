package com.Scaler.Homework.Day13;

import java.util.Scanner;

public class HQuestion2 {
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
        for (int h : A) {
            System.out.print(h);
        }
    }

    public static String solve(int[] A) {
        String result = "";
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                String s1 = Integer.toString(A[i]);
                String s2 = Integer.toString(A[j]);
                String s3 = s1 + s2;
                String s4 = s2 + s1;
                if (s3.compareTo(s4) < 0) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            result += Integer.toString(A[i]);
        }
        return result.startsWith("0") ? "0" : result;
    }
}
