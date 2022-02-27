package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderLinewise4Traversal {
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

    //Pair class created
    private static class Pair {
        Node root;
        int level;

        Pair(Node root, int level) {
            this.root = root;
            this.level = level;
        }
    }

    public static void levelTraversal(Node root) {
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(root, 1)); //This time we will add pair

        int level = 1;
        while (mq.size() > 0) {
            Pair p = mq.remove();

            if (p.level > level) {
                level = p.level;
                System.out.println();
            }
            System.out.print(p.root.data + " ");
            for (Node child : p.root.children) {
                Pair cp = new Pair(child, level + 1);
                mq.add(cp);
            }
        }

        System.out.println(".");
    }
}
