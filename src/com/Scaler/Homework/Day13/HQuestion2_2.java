package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion2_2 {
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
        int n = A.length;
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.toString(A[i]);
        }
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}