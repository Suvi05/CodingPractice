package com.Scaler.Assignment.Day11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AQuestion3_HM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int N = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the B : ");
        int B = sc.nextInt();

        Map<Integer, Boolean> hm = new LinkedHashMap<Integer, Boolean>();

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], true);
        }
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey((A[i] ^ B))) {
                count++;
            }
        }
        System.out.println(count/2);
    }
}