package com.Scaler.Homework.Day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long A = sc.nextLong();
        System.out.println(colorful(A));
    }

    public static int colorful(long A) {

        char[] ch = Long.toString(A).toCharArray();
        int len = ch.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Character.getNumericValue(ch[i]);
        }


        int result = 0;
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        int prod = 1;
        int i = -1;
        while (i < ch.length - 1) {
            i++;
            prod *= Character.getNumericValue(ch[i]);
            if (hm.containsKey(prod) == false) {
                hm.put(prod, Character.getNumericValue(ch[i]));
            } else {
                return 1;
            }
        }
        System.out.println(hm);
        return result;
    }
}
/*for (int i = 0; i < ch.length; i++) {
            for(int j=i+1;j<ch.length;j++){

            }
            prod *= Character.getNumericValue(ch[i]);
            if (hm.containsKey(prod)) {
                return 1;
            } else {
                hm.put(prod, Character.getNumericValue(ch[i]));
            }
        }*/