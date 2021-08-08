package com.DSApractice.Arrays.Arrays2D;

import java.util.Scanner;

public class Demo2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Column : ");
        int c = sc.nextInt();
        int[][] print = solve(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(print[i][j] + " ");
                ;
            }
            System.out.println();
        }
    }

    public static int[][] solve(int r, int c) {
        int[][] result = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                count++;
                result[i][j] = count;
            }
        }
        return result;
    }
}
