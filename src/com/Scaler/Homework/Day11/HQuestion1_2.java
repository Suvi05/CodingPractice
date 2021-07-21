package com.Scaler.Homework.Day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HQuestion1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First String :");
        String A = sc.nextLine();
        int n = A.length();
        System.out.print("Enter the Second String :");
        String B = sc.nextLine();
        int m = B.length();
        System.out.println(solve(A, B));
    }

    public static int solve(String s1, String s2) { //A is pattern B is source
        int count = 0;
        if (s2.length() < s1.length()) return 0;

        List<Integer> ans = new ArrayList<Integer>();
        int[] arr = new int[27];
        int n = s1.length();
        for (char ch : s1.toCharArray()) {
            arr[ch - 'a'] += 1;
        }
        int[] curr = new int[27];
        for (int i = 0; i < s1.length(); i++)
            curr[s2.charAt(i) - 'a'] += 1;
        if (check(curr, arr)) count++;

        for (int i = s1.length(); i < s2.length(); i++) {
            int prev = i - s1.length();
            curr[s2.charAt(prev) - 'a'] -= 1;
            curr[s2.charAt(i) - 'a'] += 1;
            if (check(arr, curr)) count++;
        }
        return count;
    }

    public static boolean check(int[] arr1, int[] arr2) {
        for (int i = 0; i < 27; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
//abc
//abcbacabc --5