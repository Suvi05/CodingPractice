package com.Scaler.Homework.Day12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int A = sc.nextInt();
        System.out.println(colorful(A));
    }

    public static int colorful(int A) {
        String s = String.valueOf(A);
        char[] ch = s.toCharArray();
        int[] arr = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(ch[i]));
        }
        HashSet<Integer> hm = new HashSet<>();
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                mul = 1;
                for (int k = i; k <= j; k++) {
                    mul = mul * arr[k];
                }
                if (hm.contains(mul)) {
                    return 0;
                } else {
                    hm.add(mul);
                }
            }
        }
        return 1;
    }
}
