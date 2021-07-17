package com.DSApractice.HashMaps;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements in Array A: ");
        ArrayList<Integer> A = new ArrayList<>();
        while (sc.hasNextInt()) {
            A.add(sc.nextInt());
        }
        sc.nextLine();

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int val : A) {
            hm.put(val, true);
        }
        System.out.println(hm);
        for (int val : A) {
            if (hm.containsKey(val - 1)) {
                hm.put(val, false);
            }
        }
        System.out.println(hm);
        int maxStartPoint = 0;
        int maxLength = 0;
        for (int val : A) {
            if (hm.get(val) == false) {
                int tempLen = 1;
                int tempStartPoint = val;

                while (hm.containsKey(tempStartPoint + tempLen)) {
                    tempLen++;
                }
                if (tempLen > maxLength) {
                    maxStartPoint = tempStartPoint;
                    maxLength = tempLen;
                }
            }
        }
        for (int i = 0; i <= maxLength; i++) {
            System.out.print((maxStartPoint-1) + i);
        }
    }
}
//10 5 9 1 11  8 6 15 3 12 2