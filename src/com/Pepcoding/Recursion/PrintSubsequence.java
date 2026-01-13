package com.Pepcoding.Recursion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubsequence(str, "");
    }

    public static void printSubsequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String rem = ques.substring(1);

        printSubsequence(rem, ans + ch);
        printSubsequence(rem, ans + "-");
    }
}
