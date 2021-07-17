package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(s, B));
    }

    public static String solve(String A, int B) {
        int C = B % A.length();

        String result1 = "";
        char[] ch1 = A.toCharArray();

        for (int i = 0; i < A.length() - C; i++) {
            result1 += ch1[i];
        }

        String result2 = "";
        for (int i = A.length() - C; i < A.length(); i++) {
            result2 += ch1[i];
        }

        return result2 + result1;
    }
}
