package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GT11_RemoveLeavesOfGenericTree {
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
        removeleaves(root);
        display(root);
    }

    public static void removeleaves(Node root) {

        System.out.println("root ->" + root.children.size());
        //👉 Current node ke direct leaf children hatao
        for (int i = root.children.size() - 1; i >= 0; i--) {
            Node child = root.children.get(i);
            if (child.children.size() == 0) { //Agar child k "0" child h
                root.children.remove(child); // to root.children k neeche se remove kr do us child ko
            }
        }

        //👉 Bache hue children pe same kaam karo
        for (Node child : root.children) {
            removeleaves(child);
        }
    }

    /*
     Term	            Meaning
     root	         - current node
     root.children	 - uske direct children
     child	         - unme se ek
     child.children	 - uske bachhe
    * */

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