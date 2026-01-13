package com.Pepcoding.Recursion;

import java.util.Scanner;

public class DisplayAnArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArray(arr, 0);
    }

    public static void displayArray(int[] arr, int start) {
        if (start >= arr.length) {
            return;
        }
        displayArray(arr, start + 1);
        System.out.println(arr[start]);
    }
}
