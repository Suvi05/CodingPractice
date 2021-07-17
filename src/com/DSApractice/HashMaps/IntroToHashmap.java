package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.Set;

public class IntroToHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 155);
        hm.put("US", 25);
        hm.put("UK", 35);
        hm.put("Pakistan", 45);

        System.out.println(hm);
        hm.put("Sri Lanka", 10);
        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : hm.keySet()) {
            int val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }
}
