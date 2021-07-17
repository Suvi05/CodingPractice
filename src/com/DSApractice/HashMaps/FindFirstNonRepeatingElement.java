package com.DSApractice.HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            if (hm.containsValue(1)) {
                System.out.println(m.getValue());
            }
        }
    }
}
