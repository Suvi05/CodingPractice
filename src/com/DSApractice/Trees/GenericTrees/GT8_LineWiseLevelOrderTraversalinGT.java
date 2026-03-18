package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GT8_LineWiseLevelOrderTraversalinGT {
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
        lineWiseLevelOrderTraversal(root);
    }

    public static void lineWiseLevelOrderTraversal(Node root) {
        Queue<Node> mQueue = new ArrayDeque<>();
        Queue<Node> cQueue = new ArrayDeque<>();

        mQueue.add(root);

        while (mQueue.size() > 0) {
            root = mQueue.remove();
            System.out.print(root.val+" ");
            for (Node child : root.children) {
                cQueue.add(child);
            }
            if (mQueue.size() == 0) {
                System.out.println();
                mQueue = cQueue;
                cQueue = new ArrayDeque<>();
            }
        }
        System.out.println(".");
    }
}
//Remove Print Add Children