package com.DSApractice.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> path = getMazePathWithJumps(1, 1, n, m);
        System.out.println(path);
        System.out.println(path.size());
    }

    public static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mpath = new ArrayList<>();
        //Horizontal Moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpath = getMazePathWithJumps(sr, sc + ms, dr, dc);
            for (String path : hpath) {
                mpath.add("h" + ms + path);
            }
        }
        //Vertical Moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpath = getMazePathWithJumps(sr + ms, sc, dr, dc);
            for (String path : vpath) {
                mpath.add("v" + ms + path);
            }
        }
        //Diagonal Moves
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dpath = getMazePathWithJumps(sr + ms, sc + ms, dr, dc);
            for (String path : dpath) {
                mpath.add("d" + ms + path);
            }
        }
        return mpath;
    }
}
