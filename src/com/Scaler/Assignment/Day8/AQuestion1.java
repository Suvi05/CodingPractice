package com.Scaler.Assignment.Day8;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Elements to be inserted in Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the element B :");
        int B = sc.nextInt();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if ((i != j) && (A[i] + A[j] == B)) {
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
