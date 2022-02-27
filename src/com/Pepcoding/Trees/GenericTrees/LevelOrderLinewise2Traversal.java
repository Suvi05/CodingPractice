package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderLinewise2Traversal {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node() {
        }

        Node(int data) {
            this.data = data;
        }
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
        Queue<Node> mq = new ArrayDeque<>(); //Main Queue
        //Adding root in queue, because if we are passing root means at least 1 node is there in tree
        mq.add(root);
        mq.add(new Node(-1));

        //We will loop till the queue becomes empty
        while (mq.size() > 0) {
            root = mq.remove();                    //Remove
            if (root.data != -1) {
                System.out.print(root.data + " ");    //Print

                for (Node child : root.children) {    //Add
                    mq.add(child);  //Adding child of every node in queue //FIFO manner
                }
            } else {
                if (mq.size() > 0) {
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }
        }
        System.out.println(".");
    }
}
