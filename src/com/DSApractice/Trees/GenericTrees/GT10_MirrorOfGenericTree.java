package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GT10_MirrorOfGenericTree {
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
        mirror(root);
        display(root);
    }

    public static void mirror(Node root) {
        for (Node child : root.children) {
            mirror(child);
        }
        Collections.reverse(root.children);
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
//Remove Print Add Children