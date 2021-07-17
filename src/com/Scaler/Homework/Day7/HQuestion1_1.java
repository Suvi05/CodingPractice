package com.Scaler.Homework.Day7;

import java.util.Scanner;

//------METHOD FOR SMALL CALCULATIONS
public class HQuestion1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second Number : ");
        String s2 = sc.nextLine();

        //long n= (Long.valueOf(s1)+Long.valueOf(s2))% 1000000007;
        long n = (Integer.parseInt(s1, 2) + Integer.parseInt(s2, 2))% 1000000007;
        System.out.println(n);
        String s3 = Long.toBinaryString(n);
        System.out.println(s3);
    }
}
