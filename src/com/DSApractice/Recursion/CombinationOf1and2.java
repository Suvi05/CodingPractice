package com.DSApractice.Recursion;

import java.util.Scanner;

public class CombinationOf1and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        printAll(0, n, arr);
    }

    public static void printAll(int i, int n, int[] arr) {
        if (i == n) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
            return;
        }

        arr[i] = 1;
        printAll(i + 1, n, arr);
        arr[i] = 2;
        printAll(i + 1, n, arr);
    }
}
