package com.Scaler.Assignment.Day12;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int[] solve(int[] A) {
        int[] result = new int[4];
        int[] index = new int[2];
        HashMap<Integer, Integer[]> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (hm.containsKey(A[i] + A[j])) {
//                    if (i != l && i != k && j != l && j != k) {
                    if (i != j) {
                        result[0] = i;
                        result[1] = j;

// ----------Facing some issue with this approach---------------//
                        // result[2] = hm.get();
                        // result[3] = hm.get();
                        for (int d : result) {
                            System.out.println(d);
                        }
                        return result;
                    }

                } else {
                    Integer[] temp = new Integer[2];
                    temp[0] = i;
                    temp[1] = j;
                    hm.put((A[i] + A[j]), temp);
                }
            }
        }

        return result;
    }
}
// 3 4 7 1 2 9 8