package com.Pepcoding.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = getSS(str);
        System.out.println(res);
        System.out.println(res.size());
    }

    public static ArrayList<String> getSS(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> rres = getSS(rest);
        ArrayList<String> mres = new ArrayList<>();
        for (String s : rres) {
            mres.add("-" + s);
        }
        for (String s : rres) {
            mres.add(ch + s);
        }
        return mres;
    }
}