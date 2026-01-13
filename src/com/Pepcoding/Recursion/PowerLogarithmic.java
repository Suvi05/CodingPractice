package com.Pepcoding.Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(powerLogarithmic(n, x));
        sc.close();
    }

    public static int powerLogarithmic(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (x % 2 == 0) {
            int pm2 = powerLogarithmic(n, x / 2);
            return pm2 * pm2;
        } else {
            int pm2 = powerLogarithmic(n, x / 2);
            return n * pm2 * pm2;
        }
    }
}
