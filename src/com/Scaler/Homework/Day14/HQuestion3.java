package com.Scaler.Homework.Day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.print("Enter the B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(String A, int B) {
        int count = 0;
        char[] ch = A.toCharArray();
        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++) {
            freq[ch[i] - 'a']++;
            if (freq[ch[i] - 'a'] == 1) {
                count++;
            }
        }
        Arrays.sort(freq);
        for (int i = 0; i < 26; i++) {
            if (B - freq[i] >= 0 && freq[i] != 0) {
                count--;
                B -= freq[i];
            }
        }
        return count;
    }
}
//abcabbccd
//a-2  b-3 c-3 d-1
//d-1 a-2 b-3 c-3


