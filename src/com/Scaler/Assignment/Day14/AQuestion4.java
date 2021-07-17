package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        char[] A = s.toCharArray();
        System.out.println(solve(A));
    }

    public static char[] solve(char[] A) {
        char[] result = new char[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 90 && A[i] >= 65) {
                int c = A[i] + 32;
                result[i] = (char) c;
            } else {
                int d = A[i];
                result[i] = (char) d;
            }
        }
        for (int c : A) {
            System.out.print(c);
        }
        return result;
    }
}
