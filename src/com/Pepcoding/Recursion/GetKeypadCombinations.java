package com.Pepcoding.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        System.out.println(words.size());
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        String charOfCode = codes[ch-'0'];

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        for (int i = 0; i < charOfCode.length(); i++) {
            char chCode = charOfCode.charAt(i);
            for (String rstr : rres) {
                mres.add(chCode + rstr);
            }
        }
        return mres;
    }
}
