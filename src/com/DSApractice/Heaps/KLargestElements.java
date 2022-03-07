package com.DSApractice.Heaps;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();
        // write your code here
        kLargest(arr, k);
        //array se me ek PQ bharunga
    }

    public static void kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] < pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        System.out.println(pq.remove());
    }

}