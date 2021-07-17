package com.Scaler.Homework.Day8;

import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array A: ");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.print("Enter the Elements in Array A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }


        System.out.print("Enter the Size of Array B: ");
        int size1 = sc.nextInt();
        int[] B = new int[size];
        System.out.print("Enter the Elements in Array B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        int[][] result = new int[B.length][A.length];

        for (int i = 0; i < B.length; i++) {
            int k = B[i];

            int[] temp = new int[A.length];
            for (int j = 0; j < A.length; j++) {
                temp[j] = A[j];
            }
            //Reverse the whole array
            k = k % temp.length;
            int l = 0;
            int r = (temp.length - 1);
            while (l < r) {
                int temp1 = temp[l];
                temp[l] = temp[r];
                temp[r] = temp1;
                l++;
                r--;
            }

            //Reverse from 0 to k
            l = 0;
            r = temp.length - k - 1;
            while (l < r) {
                int temp1 = temp[l];
                temp[l] = temp[r];
                temp[r] = temp1;
                l++;
                r--;
            }
            //Reverse from n-k to n-1
            l = (temp.length - k);
            r = (temp.length - 1);
            while (l < r) {
                int temp1 = temp[l];
                temp[l] = temp[r];
                temp[r] = temp1;
                l++;
                r--;
            }
            result[i] = temp;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}