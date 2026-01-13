package com.Pepcoding.Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
//         int fi = firstIndex(arr, idx + 1, x);  but this will traverse whole array even if we found the element at the start
        if (arr[idx] == x) {
            return idx;
        } else {
            int fi = firstIndex(arr, idx + 1, x); // This will only be called if we haven't found x yet
            return fi;
        }
    }
}