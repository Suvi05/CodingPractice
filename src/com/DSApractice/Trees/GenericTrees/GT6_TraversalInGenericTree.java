package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class GT6_TraversalInGenericTree {
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
        traversal(root);
    }

    public static void traversal(Node root) {
        System.out.println("Node Pre" + root.val);
        for (Node child : root.children) {
            System.out.println("Edge Pre " + root.val + "--" + child.val);
            traversal(child);
            System.out.println("Edge Post " + root.val + "--" + child.val);
        }
        System.out.println("Node Post " + root.val);
    }
}