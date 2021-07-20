package com.Scaler.Homework.Day16;

import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(int A, int B) {
        int[][] dp = new int[A][B];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[A - 1][B - 1];
    }
}
