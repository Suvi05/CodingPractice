package com.Pepcoding.Stacks;

import java.util.Scanner;
import java.util.Stack;

//Right to Left
public class NextGreaterElementRight2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = nextGreaterElementRight1(arr);
        for (int data : result) {
            System.out.println(data);
        }
    }

    public static int[] nextGreaterElementRight1(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                //- a
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            nge[st.peek()] = -1;
            st.pop();
        }
        return nge;
    }
}
