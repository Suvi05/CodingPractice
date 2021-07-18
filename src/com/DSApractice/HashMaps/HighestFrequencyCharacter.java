package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                int of = hm.get(c);
                int nf = of + 1;
                hm.put(c, nf);
            } else {
                hm.put(c, 1);
            }
        }
        //Here Capital Letters and Small Letters are treated differently
        char maxChar = s.charAt(0);
        for (char key : hm.keySet()) {
            if (hm.get(key) > hm.get(maxChar)) {
                maxChar = key;
            }
        }
        System.out.println(maxChar + " " + hm.get(maxChar));
    }
}
//Abracadabrabbb --> b 5
//abracadabrabbb --> a 5