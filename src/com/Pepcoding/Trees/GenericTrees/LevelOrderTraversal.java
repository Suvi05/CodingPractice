package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
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
        Queue<Node> q = new ArrayDeque<>();
        //Adding root in queue, because if we are passing root means at least 1 node is there in tree
        q.add(root);

        //We will loop till the queue becomes empty
        while (q.size() > 0) {
            root = q.remove();                    //Remove
            System.out.print(root.data + " ");    //Print
            for (Node child : root.children) {    //Add
                q.add(child);  //Adding child of every node in queue //FIFO manner
            }
        }
        System.out.println(".");
    }
}
