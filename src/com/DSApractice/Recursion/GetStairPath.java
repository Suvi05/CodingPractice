package com.DSApractice.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPath(n);
        System.out.println(paths);
        System.out.println(paths.size());
    }

    public static ArrayList<String> getStairPath(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getStairPath(n - 1);
        ArrayList<String> paths2 = getStairPath(n - 2);
        ArrayList<String> paths3 = getStairPath(n - 3);

        ArrayList<String> mres = new ArrayList<>();

        for (String p : paths1) {
            mres.add(1 + p);
        }
        for (String p : paths2) {
            mres.add(2 + p);
        }
        for (String p : paths3) {
            mres.add(3 + p);
        }
        return mres;
    }
}