package com.LeetCode.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the Array :");
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Target :");
        int target = sc.nextInt();
        int[] C = new int[2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (target == (A[i] + A[j])) {
                    if(A[i]==A[j]){
                        C[0]=i;
                        C[1]=j;
                    }
                    else {
                        C[0] = j;
                        C[1] = i;
                    }
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
