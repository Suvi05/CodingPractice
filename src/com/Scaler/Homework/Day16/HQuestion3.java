package com.Scaler.Homework.Day16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        long result = 0;
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder(A);
        char[] ch = sb.reverse().toString().toCharArray();
        for (int i = 0; i < A.length(); i++) {
            int count = 0;
            for (int j = i; j >= 0; j--) {
                if (ch[j] < ch[i]) {
                    count++;
                }
            }
            hm.put(ch[i], count);
        }
        for (int i = 0; i < A.length(); i++) {
            result += hm.get(ch[i]) * fact(i);
        }
        result = result + 1;
        return (int) (result % 1000003);
    }

    public static long fact(int i) {
        if (i == 0) {
            return 1;
        } else {
            return (i * fact(i - 1)) % 1000003;
        }
    }
}