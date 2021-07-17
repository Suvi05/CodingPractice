package com.HackerRank.Days30.Inheritance;

import java.util.Scanner;
import java.math.*;

public class Scopes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                diff = arr[i] - arr[j];
                int z = Math.abs(diff);
                if (z > max) {
                    max = z;
                } else {
                    z = 0;
                }
            }
        }
        System.out.println(max);
    }
}


