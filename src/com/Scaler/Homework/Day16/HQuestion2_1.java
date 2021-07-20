package com.Scaler.Homework.Day16;

import java.util.Scanner;

public class HQuestion2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(int A, int B) {
        int res = result(A, B);
        return res;
    }

    public static int result(int m, int n) {
        int res = 1;
        int num = m + n - 2;
        m--;
        n--;

        if (m == 0 || n == 0) {
            return 1;
        }

        int max = Math.max(m, n);
        int val = 1;
        int count = 0;
        int min = Math.min(m, n);

        for (int i = max + 1; i <= num; i++) {
            res *= i;
            res /= val;
            val++;
        }
        return res;
    }
}
