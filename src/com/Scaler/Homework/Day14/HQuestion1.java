package com.Scaler.Homework.Day14;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int count = 0;
        char[] ch = A.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                for (int j = i; j < ch.length; j++) {
                    count++;
                }
            }
        }
        return count;
    }
}
