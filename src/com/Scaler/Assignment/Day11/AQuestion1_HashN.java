package com.Scaler.Assignment.Day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AQuestion1_HashN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the Target : ");
        int B = sc.nextInt();
        AQuestion1_HashN obj = new AQuestion1_HashN();
        System.out.println(Arrays.toString(obj.twoSumHash(A, B)));
    }

    public int[] twoSumHash(final int[] A, int B) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int sn = B - A[i];

            if (result.containsKey(sn)) {
                return new int[]{result.get(sn) + 1, i + 1};
            }
            if (!result.containsKey(A[i])) {
                result.put(A[i], i);
            }
        }
        return null;
    }
}
//4 7 -4 2 2 2 3 -5 -3 9 -4 9 -7 7 -1 9 9 4 1 -4 -2 3 -3 -5 4 -7 7 9 -4 4 -8