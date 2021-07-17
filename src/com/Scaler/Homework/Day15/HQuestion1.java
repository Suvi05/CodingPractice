package com.Scaler.Homework.Day15;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int A = sc.nextInt();
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        if (A == 0) {
            return 0;
        }
        int last = A % 10;
        int result = last + solve(A / 10);
        return result;
    }
}
