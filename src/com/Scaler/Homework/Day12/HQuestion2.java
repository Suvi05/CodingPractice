package com.Scaler.Homework.Day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of String Array : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the String in Array : ");
        String A[] = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLine();
        }
        String B = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(A, B));
    }

    public static int solve(String[] A, String B) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        char[] Bchar = B.toCharArray();

        for (int i = 0; i < Bchar.length; i++) {
            hm.put(Bchar[i], i);
        }
        System.out.println(hm);
        for (int i = 0; i < A.length - 1; i++) {
            char[] A1 = A[i].toCharArray();
            char[] A2 = A[i + 1].toCharArray();
            int len = 0;
            if (A1.length > A2.length) {
                len = A2.length;
            } else {
                len = A1.length;
            }
            int j = 0;
            for (; j < len; j++) {
                if (hm.get(A1[j]) == hm.get(A2[j])) {
                    continue;
                }
                if (hm.get(A1[j]) > hm.get(A2[j])) {
                    return 0;
                } else {
                    break;
                }
            }
            if (j == len && A2.length < A1.length) {
                return 0;
            }
        }
        return 1;
    }
}
