package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(solve(sb));
    }

    public static String solve(StringBuilder A) {

        StringBuilder f = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        A.trimToSize();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);

            if (A.charAt(i) != ' ') {
                temp = temp.append(c);
            } else {
                f.insert(0, temp).insert(0, " ");
                temp.setLength(0);
            }
        }
        f.insert(0, temp);

        return f.toString();
    }
}
