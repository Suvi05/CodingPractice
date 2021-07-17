package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Rows : ");
        int a = sc.nextInt();
        System.out.print("Enter size of Column : ");
        int b = sc.nextInt();

        int[][] A = new int[a][b];
        //----LOOPS TO TAKE INPUT IN 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //----LOOPS TO PRINT INPUT OF 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        //----LOOPS TO TAKE THE TRANSPOSE OF 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = i; j < b; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        //----LOOPS TO REVERSE THE OUTPUT OF TRANSPOSE OF 2-D ARRAY
        for (int i = 0; i < a; i++) {
            int start = 0;
            int end = a - 1;

            while (start < end) {
                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }
        //----LOOPS TO PRINT THE OUTPUT OF WHOLE QUESTION IN 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* -------Method to Print the 2D Array-----
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }*/
