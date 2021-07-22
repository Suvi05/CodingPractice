package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Elements in Array : ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Enter the Elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = A;
        int k = 0;
        int[] C = new int[n - 2];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i] < A[j]) {
                    count++;
                    if (count > 1) {
                        C[k] = B[i];
                        k++;
                        break;
                    }
                }
            }
            count = 0;
        }
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}


//------SOLUTION FOR SCALER-------------
/*public class Solution {
    public int[] solve(int[] A) {
        int count = 0;
        int[] B = A;
        int k=0;
        int[] C=new int[A.length-2];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i] < A[j]) {
                    count++;
                    if (count > 1) {
                        C[k]=B[i];
                        k++;
                        break;
                    }
                }
            }
            count = 0;
        }
        return C;
    }
}
*/

/*int[] B=new int[n-2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] < A[j]) {
                    count++;
                    if (count > 1) {
                        B[i] = A[j];
                    }
                }
               count=0;
            }
        }
        for(int i=0;i<n-2;i++) {
            System.out.print(B[i]);
        }*/