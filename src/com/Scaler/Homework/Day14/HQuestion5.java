package com.Scaler.Homework.Day14;

import java.util.Scanner;

public class HQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the elements in Array : ");
        String[] A = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLine();
        }
        System.out.println(solve(A));
    }

    public static String solve(String[] A) {
        if (A.length == 0) {
            return "";
        } else {
            String prefix = A[0];
            for (int i = 0; i < A.length; i++) {
                while (A[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }
    }
}