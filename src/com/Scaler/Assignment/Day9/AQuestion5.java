package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestion5 {
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
        //----LOOPS TO PRINT ROW WITH MAXIMUM 1s
        int count = 0;
        int max = 0;
        int flag = 0;
        int i = 0;

        while (i < a) {
            for (int j = 0; j < b; j++) {
                if (A[i][j] == 1) {
                    count++;
                    if (count > max) {
                        max = count;
                        flag = i;
                    }
                }
            }
            count = 0;
            i++;
        }
        System.out.println(flag);
    }
}