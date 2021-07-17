package com.DSApractice.HashMaps;

import java.util.*;

public class CountFrequency {
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
        }
    }
}
//----------PRINTING OF MAP------

      /*Set<Integer> set = hm.keySet();
        for (Integer num : set) {
            System.out.println(num + "      " + hm.get(num));
        }
--------------------------------------
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        }*/