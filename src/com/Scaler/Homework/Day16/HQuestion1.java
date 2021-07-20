package com.Scaler.Homework.Day16;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int A = sc.nextInt();
        System.out.println(solve(A));
    }

    public static String solve(int A) {
        String result = "";
        while (A > 0) {
            int B = (A - 1) % 26;
            result += (char) (B + 'A');
            A = (A - 1) / 26;
        }
        char[] ch = result.toCharArray();
        StringBuilder res = new StringBuilder(result);
        return res.reverse().toString();
    }
}
