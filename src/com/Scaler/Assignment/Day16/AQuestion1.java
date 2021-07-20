package com.Scaler.Assignment.Day16;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int result = 0;
        char[] ch = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            result += (ch[i] - 64) * Math.pow(26, (A.length() - i - 1));
        }
        return result;
    }
}
//AB-28
//ABCD-19010