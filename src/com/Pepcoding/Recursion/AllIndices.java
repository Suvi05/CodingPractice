package com.Pepcoding.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result = allIndices(arr, 0, x, 0);
        System.out.println(Arrays.toString(result));
    }

    public static int[] allIndices(int[] arr, int idx, int x, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, idx + 1, x, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, idx + 1, x, fsf);
            return iarr;
        }
    }
}