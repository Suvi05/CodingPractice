package com.Scaler.Homework.Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HQuestion3_1 {
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
        Arrays.sort(ch);
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            arr.add(ch[i]);
        }


        return count;
    }
}


//abcabbccd