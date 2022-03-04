package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.Set;

public class IntroToHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 155);
        hm.put("Pakistan", 45);

        System.out.println(hm);
        hm.put("Sri Lanka", 10);//Position of Insertion we can't control
        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Russia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Russia"));

        Set<String> keys = hm.keySet();
        System.out.println(keys); //Sari Keys Mil jayegi

        for (String key : hm.keySet()) {
            int val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }
}
