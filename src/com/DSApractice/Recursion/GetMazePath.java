package com.DSApractice.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePath(1, 1, n, m);
        System.out.println(paths);
        System.out.println(paths.size());
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sc == dc && sr == dr) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if (sr < dr) {
            hpath = getMazePath(sr + 1, sc, dr, dc);
        }
        if (sc < dc) {
            vpath = getMazePath(sr, sc + 1, dr, dc);
        }

        ArrayList<String> mpaths = new ArrayList<>();

        for (String h : hpath) {
            mpaths.add("h" + h);
        }
        for (String v : vpath) {
            mpaths.add("v" + v);
        }
        return mpaths;
    }
}