package com.DSApractice.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueIntro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = {1, 4, 34, 87, 7, 67};

        for (int val : arr) {
            pq.add(val);
        }

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
