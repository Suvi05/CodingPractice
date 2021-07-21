package com.Scaler.Homework.Day12;

import java.util.HashMap;
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
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                int of = hm.get(A[i]);
                int nf = of + 1;
                hm.put(A[i], nf);
            } else {
                hm.put(A[i], 1);
            }
        }
        System.out.println(hm);

        if (hm.size() / 2 == 1) {
            if (hm.get(A[0]) == hm.get(A[1])) {
                return "WIN";
            }
        }
        return "LOSE";
    }
}
