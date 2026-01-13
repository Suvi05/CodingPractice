package com.Pepcoding.Stacks;

import java.util.Scanner;
import java.util.Stack;

//Right to Left
public class NextGreaterElementRight1 {
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
        nge[arr.length - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                //arr[i] se choto ko pop krwana h
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
