package com.Scaler.Homework.Day14;

import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        char[] ch = A.toCharArray();
        int count = 0;
        if (isPalindrome(A) == true) {
            if (A.length() % 2 != 0) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            for (int i = 0; i < A.length() - 1; i++) {
                if (ch[i] != ch[A.length() - 1 - i]) {
                    count++;
                }
            }
            if (count == 2) {
                return "YES";
            }
        }
        return "NO";
    }

    public static boolean isPalindrome(String B) {
        char[] ch = B.toCharArray();
        for (int i = 0; i < B.length() - 1; i++) {
            if (ch[i] != ch[B.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}