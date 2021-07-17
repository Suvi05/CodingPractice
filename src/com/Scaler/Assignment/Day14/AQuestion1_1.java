package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        A = A.trim().replaceAll("[ ]{2,}", " ");
        int len = A.length();
        String f = "";
        String temp = "";
        for (int i = 0; i < len; i++) {

            if (A.charAt(i) != ' ') {
                temp += A.charAt(i);
            } else {
                f = " " + temp + f;
                temp = "";
            }
        }
        f = temp + f;
        return f;
    }
}
