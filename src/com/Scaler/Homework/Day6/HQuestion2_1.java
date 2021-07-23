package com.Scaler.Homework.Day6;

import java.util.Scanner;

public class HQuestion2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0; j--) {
                while (j != 0) {
                    j -= (j & (-j));
                    count++;
                }
            }
           }
        System.out.println(count);
    }
}
