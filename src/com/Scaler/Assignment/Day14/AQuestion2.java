package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(solve(sb));
    }

    public static String solve(StringBuilder A) {
        StringBuilder st = new StringBuilder();
        st.append(A);
        return st.reverse().toString();
    }
}
