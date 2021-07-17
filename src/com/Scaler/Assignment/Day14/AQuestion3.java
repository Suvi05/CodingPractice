package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(sb, B));
    }

    public static String solve(StringBuilder A, int B) {

        A.reverse();
        int len = A.length();
        B = B % A.length();

        StringBuilder st1 = new StringBuilder(A.substring(0, B));
        StringBuilder st2 = new StringBuilder(A.substring(B, len));

        st1.reverse();
        st2.reverse();
        st1.append(st2);
        return st1.toString();
    }
}
