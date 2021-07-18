package com.DSApractice.HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String A = sc.nextLine();
        System.out.print(solve(A));
    }

    public static int solve(String A) {
        Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        //If character is already present then get -- "ch" and add 1 to it.
        //If character is not already present then get -- "0" and add 1 to it.
        for (char ch : A.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        //Checking in the HashMap that which element is having frequency as ==1
        //And return the index of that char, which is NON REPEATING in String
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (hm.get(c) == 1) {
                System.out.print(c + " ");
                return i;
            }
        }

        //If nothing is found then return -1
        return -1;
    }
}
//abbcaddecfab