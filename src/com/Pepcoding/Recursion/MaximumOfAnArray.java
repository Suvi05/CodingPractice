package com.Pepcoding.Recursion;

import java.util.Scanner;

public class MaximumOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maximum = maximumOfAnArray(arr, 0);
        System.out.println(maximum);
    }

    public static int maximumOfAnArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[arr.length - 1];
        }
        int misa = maximumOfAnArray(arr, idx + 1);
        return Math.max(arr[idx], misa);
    }
}