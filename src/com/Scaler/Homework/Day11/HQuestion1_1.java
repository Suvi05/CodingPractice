package com.Scaler.Homework.Day11;

import java.util.HashMap;
import java.util.Scanner;

public class HQuestion1_1 {
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

    public static int solve(String A, String B) { //A is pattern B is source
        HashMap<Character, Integer> Bmap = new HashMap<>();
        HashMap<Character, Integer> Amap = new HashMap<>();

        //Map for Pattern
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            Amap.put(ch, Amap.getOrDefault(ch, 0) + 1);
        }
        //Map for Source
        for (int i = 0; i < A.length(); i++) {
            char ch = B.charAt(i);
            Bmap.put(ch, Bmap.getOrDefault(ch, 0) + 1);
        }
        int i = A.length();
        int count = 0;
        while (i < B.length()) {
            //Checking if the two maps are equal.
            if (compare(Amap, Bmap) == true) {
                count++;
            }
            char cha = B.charAt(i); //Aquiring
            Bmap.put(cha, Bmap.getOrDefault(cha, 0) + 1);

            char chr = B.charAt(i - A.length()); //Releasing the first string of sliding window
            if (Bmap.get(chr) == 1) { //If only 1 item is there.. then remove it from the map
                Bmap.remove(chr);
            } else {   //Else just reduce the frequency of it
                Bmap.put(chr, Bmap.get(chr) - 1);
            }
            i++;
        }
        if (compare(Amap, Bmap) == true) {
            count++;
        }
        return count;
    }

    public static boolean compare(HashMap<Character, Integer> smap, HashMap<Character, Integer> pmap) {
        for (char sch : smap.keySet()) {
            if (pmap.getOrDefault(sch, 0) != smap.get(sch)) {
                return false;
            }
        }
        return true;
    }
}
//abc
//abcbacabc --5