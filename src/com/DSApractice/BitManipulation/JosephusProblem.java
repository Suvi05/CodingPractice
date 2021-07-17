package com.DSApractice.BitManipulation;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Soldiers : ");
        int j = sc.nextInt();
        System.out.println(Integer.toBinaryString(j));

        if (j == 0) {
            System.out.println(0);
        } else {
            int n = j;
            System.out.println(n);
            n |= n >> 1;
            n |= n >> 2;
            n |= n >> 4;
            n |= n >> 8;
            n |= n >> 16;

            System.out.println(Integer.toBinaryString(n));
            n = n + 1;
            System.out.println(Integer.toBinaryString(n));

            int result = (((j - (n >> 1)) << 1) + 1);
            System.out.println(result + " Will Survive");
        }
    }
}
