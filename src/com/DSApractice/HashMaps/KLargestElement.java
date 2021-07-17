package com.DSApractice.HashMaps;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array A: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element K : ");
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < A.length; i++) {
            if (i < k) {
                pq.add(A[i]);
            } else {
                if (A[i] > pq.peek()) {
                    pq.remove();
                    pq.add(A[i]);
                }
            }
        }
        while (pq.size() > 0) {
            System.out.print(pq.remove()+" ");
        }
    }
}
