package com.DSApractice.Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(powerLinear(n, x));
    }

    public static int powerLinear(int n, int x) {
        if (x == 0) {
            return 1;
        }
        int pm1 = powerLinear(n, x - 1);
        int p = n * pm1;
        return p;
    }
}
