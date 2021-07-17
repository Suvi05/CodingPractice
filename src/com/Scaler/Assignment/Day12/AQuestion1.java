package com.Scaler.Assignment.Day12;

import java.util.HashMap;
import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the B : ");
        int B = sc.nextInt();

        System.out.println(solution(A, B));

    }

    public static int[] solution(int[] A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = -1;
        int sum = 0;
        hm.put(sum, i);
        while (i < A.length - 1) {
            i++;
            sum += A[i];
            if (hm.containsKey(sum - B) == false) {
                hm.put(sum, i);
            } else {
                int c = hm.get(sum - B);
                int len = i - hm.get(sum - B);
                int[] result = new int[len];
                for (int j = 0; j < len; j++) {
                    result[j] = A[c + j + 1];
                }
                for (int r : result) {
                    System.out.print(r + " ");
                }
                return result;
            }
        }
        return new int[]{-1};
    }
}

