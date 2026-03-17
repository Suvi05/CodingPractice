package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class GT2_DisplayGenricTree {
    private static class Node {
        int val;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Stack<Node> st = new Stack<>();
        Node root = null;
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
        display(root);
    }

    public static void display(Node root) {
        String str = root.val + "->";
        for (Node child : root.children) {
            str += child.val + ",";
        }
        str += ".";

        System.out.println(str);

        for (Node child : root.children) {
            display(child);
        }
    }
}
