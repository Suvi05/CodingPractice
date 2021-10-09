package com.LeetCode.Maths;

import java.util.Scanner;

public class IsPowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        int rem = 0;
        if (n < 1) return false;
        while (n > 0) {
            rem+= n%3;
            n=n/3;
        }
        if (rem == 0) return true;
        else return false;
    }
}
