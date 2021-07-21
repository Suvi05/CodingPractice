package com.Scaler.Homework.Day14;

import java.util.*;

public class HQuestion3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.print("Enter the B : ");
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(String A, int B) {

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.size());

        int min = 0;
        int max = 0;

        /*char minChar = hm.get(Key with minimum frequency);
        char maxChar = hm.get(Key with max frequency);
        while (B >= min) {
            hm.remove(minChar);
            hm.put(maxChar);
            B = B - min;
        }*/
        return hm.size();
    }
}


//abcabbccd