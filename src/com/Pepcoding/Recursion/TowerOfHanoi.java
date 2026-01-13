package com.Pepcoding.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 1, B = 2, C = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char A, char B, char C) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, A, C, B);
        System.out.println("Move disk " + n + " from " + A + " to " + B);
        towerOfHanoi(n - 1, C, B, A);
    }
}
