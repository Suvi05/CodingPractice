package com.DSApractice.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter size of Array A:");
        int n1 = sc.nextInt();

        System.out.print("Enter the Elements in Array A: ");
        System.out.println("Enter elements of Array A:");
        for (int i = 0; i < n1; i++) {
            A.add(sc.nextInt());
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();
        //Set all the Keys as TRUE initially
        for (int val : A) {
            hm.put(val, true);
        }
        System.out.println(hm);
        //Set all those Keys as FALSE which also contains those elements, which comes before them.
        for (int val : A) {
            if (hm.containsKey(val - 1)) {
                hm.put(val, false);
            }
        }
        System.out.println(hm);

        int maxStartPoint = 0;
        int maxLength = 0;
        for (int val : A) {
            if (hm.get(val) == true) {
//It is also working for FALSE, we just have to change maximumStartPoint-1 instead of maximumStartPoint in last loop
//And in last condition also we have to do : for (int i = 0; i <= maxLength; i++)
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
        for (int i = 0; i < maxLength; i++) {
            System.out.print(maxStartPoint + i + " ");
        }
    }
}
//10 5 9 1 11  8 6 15 3 12 2