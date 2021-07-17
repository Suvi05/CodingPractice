package com.DSApractice.Recursion;

import java.util.Scanner;

public class PowerFunctionLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Power : ");
        int n = sc.nextInt();
        System.out.println("Result is : " + power(x, n));
    }

    public static int power(int x, int n) {
        int pow = 0;
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            pow = power(x, n / 2) * power(x, n / 2);
            return pow;
        } else {
            pow = power(x, n / 2) * power(x, n / 2) * x;
            return pow;
        }
    }
}
//Time Complexity is Better than PowerFunction.java
// Because here we are taking lograithmic steps... i.e. GP
// n.. n/2..n/4....2..1 ---> Time Complexity --> O(logN)
// Means for 1024 steps it will take only 10 steps...
// while in PowerFunction.java it will take O(n) Steps