package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
        int maxLen = 0;
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        //HashMap<Remender, Indexes>
        int sum = 0;
        int rem = 0;
        int index = -1;
        hm.put(rem, index);
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            rem = sum % K;

            if (rem < 0) {
                //Normalizing The nagative Reminder
                rem += K;
            }
            if (hm.containsKey(rem)) {
                int inx = hm.get(rem);
                int len = i - inx;
                //Checking if the new len is greater than maxLen
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                hm.put(rem, i);
            }
        }
        return maxLen;
    }
}
//12
//2 4 8 1 7 3 6 1 9 2 7 3
// K=5