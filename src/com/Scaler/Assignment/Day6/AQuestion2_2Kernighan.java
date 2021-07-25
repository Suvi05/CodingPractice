package com.Scaler.Assignment.Day6;

import java.util.Scanner;

public class AQuestion2_2Kernighan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Put number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            //int rsb = (n & (-n));
            //n-=rsb;
            n -= (n & (-n));
            count++;
        }

        System.out.println(count);
    }
}

