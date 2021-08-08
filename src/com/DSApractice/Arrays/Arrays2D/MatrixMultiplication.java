package com.DSApractice.Arrays.Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
=====  MAIN POINTS TO REMEMBER  =====

1- 2 matrices could only be multiplied if C1==R2
2- Resultant matrix of R1XC1 and R2XC2 will be R1XC2
3- Extra loop for k will run in the multiplication loop, to do calculation based on C1 or R2
i.e. -              for (int k = 0; k < r2; k++) {
                        result[i][j] += M1[i][k] * M2[k][j];

*/
        // MATRIX - 1
        System.out.print("Enter Number of Rows for Matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter Number of Column for Matrix 1 : ");
        int c1 = sc.nextInt();
        int[][] M1 = new int[r1][c1];
        //Elements of Array A
        int count1 = 0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                count1++;
                M1[i][j] = count1;
            }
        }

        // MATRIX - 2
        System.out.print("Enter Number of Rows for Matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter Number of Column for Matrix 2 : ");
        int c2 = sc.nextInt();
        int[][] M2 = new int[r2][c2];
        //Elements of Matrix 2
        int count2 = 0;
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                count2++;
                M2[i][j] = count2;
            }
        }
        int[][] result = solve(M1, M2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] M1, int[][] M2) {
        int r1 = M1.length;
        int c1 = M1[0].length;
        int r2 = M2.length;
        int c2 = M2[0].length;
        int[][] result = new int[r1][c2];

        if (c1 != r2) {
            System.out.println("Invalid");
            return null;
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++) {
                        result[i][j] += M1[i][k] * M2[k][j];
                    }
                }
            }
        }
        return result;
    }
}
