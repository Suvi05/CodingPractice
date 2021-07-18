package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        //If character is already present then +1 to it.
        //If character is NOT already present then hm.put(A[i], 1).
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }
        System.out.println(hm);
        //Checking in the HashMap that which element is having frequency as ==1
        //And return that Number, which is First NON REPEATING in array and then break the Loop.
        for (int c : hm.keySet()) {
            if (hm.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
//12
//a b b c a d d e c f a b
//12
//2 5 4 8 9 6 3 7 1 2 5 8