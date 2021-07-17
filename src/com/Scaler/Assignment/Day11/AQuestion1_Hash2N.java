package com.Scaler.Assignment.Day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AQuestion1_Hash2N {
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
        AQuestion1_Hash2N obj = new AQuestion1_Hash2N();
        System.out.println(Arrays.toString(obj.twoSumHash(A, B)));
    }

    public int[] twoSumHash(final int[] A, int B) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            result.put(A[i], i);
        }
        for (int i = 0; i < A.length; i++) {
            int sn = B - A[i];
            if (result.containsKey(sn) && result.get(sn) != B) {
                return new int[]{i, result.get(sn)};
            }
        }
        return null;
    }
}
