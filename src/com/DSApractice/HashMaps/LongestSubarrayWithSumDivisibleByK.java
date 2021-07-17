package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the K : ");
        int K = sc.nextInt();
        System.out.println(solution(A, K));
    }

    public static int solution(int[] A, int K) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen = 0;
        int i = -1;
        int sum = 0;
        hm.put(sum, i);
        while (i < A.length - 1) {
            i++;
            sum += A[i];
            //if()
        }
        return maxLen;
    }
}
