package com.DSApractice.Recursion;

import java.util.Scanner;

public class PowerFunction {
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
        int powm1 = power(x, n - 1); //This one is for calculating power of (n-1)
        pow = x * powm1;                // Then we are multiplying x one more time
        return pow;                     //Solving it through PMI
    }
}
//Alternative Approch : pow = x * power(x, n - 1);