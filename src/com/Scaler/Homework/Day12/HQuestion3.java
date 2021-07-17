package com.Scaler.Homework.Day12;

import java.util.HashMap;
import java.util.Scanner;

public class HQuestion3 {
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
        HashMap<Integer, Integer> hm = new HashMap<>();
        int tom = 0;
        int harry = 0;
        if (A.length % 2 == 0) {
            for (int i = 0; i < A.length; i++) {
                if (hm.containsKey(A[i])) {
                    hm.put(A[i], hm.get(A[i]) + 1);
                } else {
                    hm.put(A[i], 1);
                }
            }

            for (int i = 0; i < A.length; i++) {
                if (hm.containsKey(A[i])) {
                    return "WIN";
                }
            }
        }
        return "LOSE";
    }
}
