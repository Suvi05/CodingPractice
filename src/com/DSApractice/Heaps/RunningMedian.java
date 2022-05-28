package com.DSApractice.Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Enter the numbers in ArrayList");

        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();
        result = solve(ar);
        System.out.println(result);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> C = new ArrayList<>();

        PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());//Max-heap
        PriorityQueue<Integer> Right = new PriorityQueue<>();//Min-heap

        for (int i = 0; i < A.size(); i++) {
            Left.add(A.get(i));
            if (Left.size() - Right.size() == 2) {
                Right.add(Left.remove());
            }
            C.add(Left.peek());
        }
        return C;
    }
}
//32 91 86 8 4 100 98 15 79 32 4 99 -12