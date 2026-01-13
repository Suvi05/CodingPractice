package com.Pepcoding.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = stockSpan(arr);
        for (int data : result) {
            System.out.println(data);
        }
    }

    public static int[] stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] stSpan = new int[arr.length];
        stSpan[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                stSpan[i] = i + 1;
            } else {
                stSpan[i] = i - st.peek();
            }
            st.push(i);
        }
        return stSpan;
    }
}
