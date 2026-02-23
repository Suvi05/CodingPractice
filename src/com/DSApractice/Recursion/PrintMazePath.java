package com.DSApractice.Recursion;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePath(1, 1, n, m, "");
    }

    public static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
        if (sc > dc || sr > dr) return;
        if (sc == dc && sr == dr) {
            System.out.println(psf);
            return;
        }
        printMazePath(sr, sc + 1, dr, dc, psf + "h");
        printMazePath(sr + 1, sc, dr, dc, psf + "v");
    }
}