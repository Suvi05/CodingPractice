package com.DSApractice.Strings;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        charcount(str);
    }

    public static void charcount(String str) {
        char[] cha = str.toCharArray();
        int[] farr = new int[27];
        for (int i = 0; i < cha.length; i++) {
            int idx = cha[i];
            farr[idx]++;
        }
        for (int i = 1; i < farr.length; i++) {
            farr[i] = farr[i - 1] + farr[i];
        }
        for (int c : farr) {
            System.out.println(c);
        }
    }
}
