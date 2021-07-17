package com.LeetCode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int[] C = new int[n];
        int k = 1;
        Arrays.sort(A);
        int x = A[0];

        if (A.length == 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i < A.length; i++) {
                if (A[i] != x) {
                    x = A[i];
                    C[k] = A[i];
                    k++;
                }
            }
            for (int i = 0; i < C.length; i++) {
                System.out.print(C[i]);
            }
            System.out.println();
            System.out.println(k);
        }
    }
}
