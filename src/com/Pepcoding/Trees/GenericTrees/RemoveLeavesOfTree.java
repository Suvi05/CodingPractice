package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class RemoveLeavesOfTree {
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
        removeLeaves(root);
        levelTraversal(root);
    }

    public static void removeLeaves(Node root) {
        //Pre Order- To avoid unwanted removal of wrong leaf node
        for (int i = root.children.size() - 1; i >= 0; i--) {  //To Avoid Concurrent Modification Exception
            Node child = root.children.get(i);
            if (child.children.size() == 0) {
                root.children.remove(child);
            }
        }
        for (Node child : root.children) {
            removeLeaves(child);
        }
    }

    public static void levelTraversal(RemoveLeavesOfTree.Node root) {
        //Remove Print Add
        Queue<RemoveLeavesOfTree.Node> mq = new ArrayDeque<>(); //Main Queue
        //Adding root in queue, because if we are passing root means at least 1 node is there in tree
        mq.add(root);

        Queue<RemoveLeavesOfTree.Node> cq = new ArrayDeque<>(); //Child Queue
        //We will loop till the queue becomes empty
        while (mq.size() > 0) {
            root = mq.remove();                    //Remove
            System.out.print(root.data + " ");    //Print

            for (RemoveLeavesOfTree.Node child : root.children) {    //Add
                cq.add(child);  //Adding child of every node in queue //FIFO manner
            }

            if (mq.size() == 0) {
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
        System.out.println(".");
    }
}

