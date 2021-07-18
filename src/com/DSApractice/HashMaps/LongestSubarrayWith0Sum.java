package com.DSApractice.HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LongestSubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array A: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        //HashMap<PrefixSumArray,Index>
        int maxLen = 0;
        int i = -1;
        int sum = 0;
        hm.put(sum, i);
        while (i < A.length - 1) {
            i++;
            sum += A[i];
            if (hm.containsKey(sum) == false) {
                hm.put(sum, i);
            } else {
                int len = i - hm.get(sum);
                //Because of this hm.get(sum) we are taking sum as Key
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
//12
//2 8 -3 -5 2 -4 6 1 2 1 -3 4