package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class GT12_LinearizeGenericTreeO_N2 {
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
        linearize(root);
        display(root);
    }

    public static void linearize(Node root) {
        for (Node child : root.children) {
            linearize(child);
        }

        while (root.children.size() > 1) {
            Node lc = root.children.remove(root.children.size() - 1);
            Node slc = root.children.get(root.children.size() - 1);
            Node slct = getTail(slc);
            slct.children.add(lc);
        }
    }

    public static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
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