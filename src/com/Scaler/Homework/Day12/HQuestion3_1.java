package com.Scaler.Homework.Day12;

import java.util.HashSet;
import java.util.Scanner;

public class HQuestion3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static String solve(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!hs.contains(A[i])) {
                hs.add(A[i]);
            }
        }
        if (A.length % 2 == 0 && hs.size() % 2 == 0) {
            for (int i = 0; i < A.length; i++) {
                if (hs.contains(A[i])) {
                    return "WIN";
                }
            }
        }
        return "LOSE";
    }
}
