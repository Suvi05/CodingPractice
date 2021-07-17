package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        char[] A = s.toCharArray();
        System.out.println(solve(A));
    }

    public static int solve(char[] A) {
        for (int i = 0; i < A.length; i++) {
            if (!(A[i] > 63 && A[i] < 91) && !(A[i] > 96 && A[i] < 123)) {
                return 0;
            }
        }
        return 1;
    }
}