package com.Pepcoding.Recursion;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printtStairPath(n, "");
    }

    public static void printtStairPath(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        if (n < 0) {
            return;
        }
        printtStairPath(n - 1, path + "1");
        printtStairPath(n - 2, path + "2");
        printtStairPath(n - 3, path + "3");
    }
}