package com.DSApractice.Recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZigZag(n);
        sc.close();
    }

    public static void printZigZag(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("Pre " + n + " ");
        printZigZag(n - 1);
        System.out.print("In " + n + " ");
        printZigZag(n - 1);
        System.out.print("Post " + n + " ");
    }
}
