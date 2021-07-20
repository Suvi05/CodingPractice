package com.Scaler.Homework.Day16;

import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int A = sc.nextInt();
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        int result = 0;

        if (A > 0) {
            String z = String.valueOf(A);
            StringBuilder res = new StringBuilder(z);
            String y = res.reverse().toString();
            return result = Integer.valueOf(y);
        } else if (A < 0) {
            int c = Math.abs(A);
            String z = String.valueOf(c);
            StringBuilder res = new StringBuilder(z);
            String y = res.reverse().toString();
            long k = Long.valueOf(y);
            if (k > Integer.MAX_VALUE) {
                return 0;
            }
            result = -Integer.valueOf(y);
        }
        return result;
    }
}

// [-2147483648 to 2147483647]