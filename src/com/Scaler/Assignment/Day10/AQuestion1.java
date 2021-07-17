package com.Scaler.Assignment.Day10;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        char[] A = s.toCharArray();

        int acount = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'a') {
                acount++;
            } else if (A[i] == 'g') {
                count += acount;
            }
        }
        System.out.println(count);
    }
}
