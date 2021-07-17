package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestion3_1 {
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
        //----BELOW ANSWER IS WORKING IN SCALER COMPILER SUCCESSFULLY!!
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //----LOOP TO PRINT THE DESIRED OUTPUT
        int[][] result = new int[2 * A.length - 1][];
        int k = 0;
        for (int c = 0; c < A[0].length; c++) {
         //   result[k++] = getDia(A, 0, c);
        }
        for (int r = 1; r < A.length; r++) {
           // result[k++] = getDia(A, r, A.length - 1);
        }
        System.out.println(result);
    }

    public int[] getDia(int[][] A, int i, int j) {
        int[] dia = new int[j + 1 - i];
        int k = 0;
        while (i < A.length && j >= 0) {
            dia[k++] = A[i][j];
            i++;
            j--;
        }
        return dia;
    }
}
