package com.Scaler.Assignment.Day13;

import java.util.*;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int result = 0;
        Arrays.sort(A);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(i, A[i]);
        }
        result = map.get(B - 1);
        System.out.println(map);
        return result;
    }
}
// 8 16 80 55 32 8 38 40 65 18 15 45 50 38 54 52 23 74 81 42 28 16 66 35 91 36 44 9 85 58 59 49 75 20 87 60 17 11 39 62 20 17 46 26 81 92
