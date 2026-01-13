package com.Pepcoding.BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class GreyCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = solution(n);
        System.out.println(ans);

        for (String str : ans) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }

    public static ArrayList<String> solution(int n) {
        if (n == 1) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }

        ArrayList<String> rres = solution(n - 1);
        ArrayList<String> mres = new ArrayList<>();

        for (int i = 0; i < rres.size(); i++) {
            String rstr = rres.get(i);
            mres.add("0" + rstr);
        }
        for (int i = rres.size() - 1; i >= 0; i--) {
            String rstr = rres.get(i);
            mres.add("1" + rstr);
        }
        return mres;
    }
}
