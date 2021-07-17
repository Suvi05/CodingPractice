package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestionSpriralMatrix {
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
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        //----LOOPS TO PRINT SPIRAL MATRIX
        int right = b - 1;
        int top = 0;
        int left = 0;
        int bottom = a - 1;

        while (top <= bottom && left <= right) {

            //LOOP FOR LEFT TO RIGHT
            //fixed the rows, iterating through column
            for (int k = left; k <= right; k++) {
                System.out.print(A[top][k] + " ");
            }
            top++;
            //LOOP FOR TOP TO BOTTOM
            //fixed the column, iterating through row
            for (int k = top; k <= bottom; k++) {
                System.out.print(A[k][right] + " ");
            }
            right--;
            //LOOP FOR LEFT
            //fixed the row, iterating through column
            for (int k = right; k >= left; k--) {
                System.out.print(A[bottom][k] + " ");
            }
            bottom--;
            //LOOP FOR BOTTOM
            //fixed the column, iterating through row
            for (int k = bottom; k >= top; k--) {
                System.out.print(A[k][left] + " ");
            }
            left++;
        }
    }
}