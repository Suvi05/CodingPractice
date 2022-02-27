package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderLinewiseZigZagTraversal {
    private static class Node {
        int data;
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
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        levelTraversal(root);
    }

    public static void levelTraversal(Node root) {
        //Remove Print Add
        Stack<Node> ms = new Stack<>(); //Main Stack
        //Adding root in queue, because if we are passing root means at least 1 node is there in tree
        ms.push(root);
        Stack<Node> cs = new Stack<>(); //Child Queue
        //We will loop till the queue becomes empty
        int level = 1;
        while (ms.size() > 0) {
            root = ms.pop();                    //Remove
            System.out.print(root.data + " ");    //Print

            if (level % 2 == 1) {
                for (int i = 0; i < root.children.size(); i++) {
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            } else {
                for (int i = root.children.size() - 1; i >= 0; i--) {
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            }

            if (ms.size() == 0) {
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
        System.out.println(".");
    }
}
