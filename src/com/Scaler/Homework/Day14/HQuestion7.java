package com.Scaler.Homework.Day14;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Line : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        String result = "";
        String[] B = A.split("_");
        String s1 = B[0];
        String s2 = B[1];
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (ch1[i] < ch2[j]) {
                    ch1[i] = ch2[j];
                    ch2[j] = '\0';
                }
            }
            result += ch1[i];
        }
        return result;
    }
}
//abb_c