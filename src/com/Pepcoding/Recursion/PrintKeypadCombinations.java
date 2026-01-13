package com.Pepcoding.Recursion;

import java.util.Scanner;

public class PrintKeypadCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getKPC(str, "");
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void getKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);

        String chForCode = codes[ch - '0'];
        for (int i = 0; i < chForCode.length(); i++) {
            char chAtCode = chForCode.charAt(i);
            getKPC(rem, ans + chAtCode);
        }
    }
}