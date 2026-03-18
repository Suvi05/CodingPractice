package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GT9_LineWiseLevelOrder_ZigZagTraversalinGT {
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
        lineWiseLevelOrderZigZagTraversal(root);
    }

    public static void lineWiseLevelOrderZigZagTraversal(Node root) {
        Stack<Node> ms = new Stack<>();
        ms.push(root);
        boolean level = true;
        Stack<Node> cs = new Stack<>();

        while (ms.size() > 0) {
            root = ms.pop(); //Remove
            System.out.print(root.val + " "); //Print
            if (level) { //Add Children
                for (int i = 0; i < root.children.size(); i++) { //Increasing
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            } else {
                for (int i = root.children.size()-1; i >= 0; i--) {
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            }

            if (ms.size() == 0) {
                ms = cs;
                cs = new Stack<>();
                System.out.println();
                level = !level;
            }
        }
    }
}
//Remove Print Add Children