package com.Scaler.Homework.Day14;

import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int count = 0;
        char[] ch = A.toCharArray();
        for (int i = 0; i < A.length() - 2; i++) {
            if (ch[i] == 'b' && ch[i + 1] == 'o' && ch[i + 2] == 'b') {
                count++;
            }
        }
        return count;
    }
}
