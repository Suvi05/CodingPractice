package com.Pepcoding.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class EularTraversal {
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
        traversal(root);
    }

    public static void traversal(Node root) {
        //Eular's Left, Node's Pre Area, On the way deep in the recursion
        System.out.println("Node Pre " + root.data);
        for (Node child : root.children) {
            //Edge Pre Area
            System.out.println("Edge Pre " + root.data + "--" + child.data);
            traversal(child);
            //Edge Post Area
            System.out.println("Edge Post " + root.data + "--" + child.data);
        }
        //Eular's Right, Node's Post Area, On the way out of the recursion
        System.out.println("Node Post " + root.data);
    }
}
