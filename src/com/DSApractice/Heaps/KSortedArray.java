package com.DSApractice.Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();
        sortArray(arr, k);
    }

    public static void sortArray(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k + 1; i < arr.length; i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }
}
