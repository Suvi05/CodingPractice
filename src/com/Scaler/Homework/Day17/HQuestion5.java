package com.Scaler.Homework.Day17;

import java.util.Scanner;

public class HQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the Value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B) + " WINS!! ");
    }

    public static int solve(int A, int B) {
        if (B == 1) {
            return 2;
        }
        if (A % 2 == 0) {
            return 2;
        }
        return 1;
    }
}
