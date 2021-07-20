package com.Scaler.Assignment.Day16;

import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int A = sc.nextInt();
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        String z = Integer.toString(A);
        StringBuilder x = new StringBuilder(z);
        String D = x.toString();
        String E = x.reverse().toString();
        if (D.length() == 1) {
            return 1;
        }
        if (A > 0) {
            if (D.equals(E)) {
                return 1;
            }
        }
        return 0;
    }
}
