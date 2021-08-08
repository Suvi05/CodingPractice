package com.DSApractice.Arrays.Arrays2D;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Column : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                count++;
                matrix[i][j] = count;
            }
        }
        int[] result = solve(matrix);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static int[] solve(int[][] matrix) {
        int[] result = new int[matrix.length * matrix[0].length];
        int k = -1;

        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    k++;
                    result[k] = matrix[i][j];
                }
            } else {
                for (int i = matrix.length - 1; i >= 0; i--) {
                    k++;
                    result[k] = matrix[i][j];
                }
            }
        }
        return result;
    }
}
