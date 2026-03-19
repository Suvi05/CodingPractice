package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GT14_FindElementInGenericTree {
    private static class Node {
        int val;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.val = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }


        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find in Tree : ");
        int n = sc.nextInt();
        boolean result = findElement(root, n);
        System.out.println(result);
    }

    public static boolean findElement(Node root, int n) {
        if (root.val == n) return true;
        for (Node child : root.children) {
            boolean res = findElement(child, n);
            if (res) return true;
        }
        return false;
    }
}
//Remove Print Add Children