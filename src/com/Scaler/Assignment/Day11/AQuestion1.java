package com.Scaler.Assignment.Day11;

import java.util.Arrays;
import java.util.Scanner;

public class AQuestion1 {
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
        AQuestion1 obj = new AQuestion1();
        System.out.println(Arrays.toString(obj.twoSum(A, B)));
    }

    public int[] twoSum(final int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
