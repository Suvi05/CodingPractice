package com.Scaler.Assignment.Day11;

import java.util.*;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int N = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the Array : ");
        int M = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                int of = hm.get(A[i]);
                int nf = of + 1;
                hm.put(A[i], nf);
            } else {
                hm.put(A[i], 1);
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (hm.containsKey(B[i]) && hm.get(B[i]) > 0) {
                System.out.print(B[i]+" ");
                int of = hm.get(B[i]);
                int nf = of - 1;
                hm.put(B[i], nf);
            }
        }
    }
}
   /*Enter the size of the Array:4
           Enter the elements of Array:2 1 4 10
           Enter the size of the Array:5
           Enter the elements of Array:3 6 2 10 10*/