package com.Scaler.Homework.Day9;

import java.util.Scanner;

public class HQuestion1 {
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
        //------LOOP TO FIND OUT THE INTEGER IN ARRAY
        System.out.print("Enter the c : ");
        int c = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (A[i][j] == c) {
                    ans=((i + 1) * 1009 + (j + 1));
                }
            }
        }
        System.out.println(ans);
    }
}