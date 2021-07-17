package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOf0SumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int i = -1;
        int sum = 0;
        hm.put(0, 1);
        while (i < A.length - 1) {
            i++;
            sum += A[i];
            if (hm.containsKey(sum)) {
                count += hm.get(sum);
                int of = hm.get(sum);
                int nf = of + 1;
                hm.put(sum, nf);
            } else {
                hm.put(sum, 1);
            }
        }
        System.out.println(hm);
        return count;
    }
}
//2 8 -3 -5 2 -4 6 1 2 1 -3 4 -1 -3