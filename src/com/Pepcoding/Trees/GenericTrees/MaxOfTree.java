package com.Pepcoding.Trees.GenericTrees;

import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.Stack;

public class MaxOfTree {
    //We created Node first -> Node of Tree
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //Then secondly we called the main function
    public static void main(String[] args) {

        //Input to be put in Generic Tree
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        //Declared root -> We could have also done this by creating a Generic class and then instantiating it there.
        Node root = null;   //Null because in starting there will be no value in root

        //Stack to keep track of parent of each new node.
        Stack<Node> st = new Stack<>();

        //Looping through whole input array
        for (int i = 0; i < arr.length; i++) {
            //In case of -1 remove the latest parent from stack
            if (arr[i] == -1) {
                st.pop();
            } else {
                //Else create a new Node to put data into that node from input array
                Node t = new Node();
                t.data = arr[i];
                //Fir is node ko stack me push krne jayege

                //If Stack already contains any Node(Parent) then we will make that new node as child of stack's peek
                if (st.size() > 0) {
                    st.peek().children.add(t); //Peek ke children me add kr diya new node ko n last me stack me push kr denge
                } else {
                    //Else if the inserted node is the first one, then it will be the root of that generic tree
                    root = t;
                }
                //Finally, put that new node in stack to make that one parent for coming nodes
                st.push(t);
            }
        }

        System.out.println("Max of the tree: " + max(root));
    }

    public static int max(Node root) {
        int m = Integer.MIN_VALUE;
        for (Node child : root.children) { //Loop to do recursion on children of root node
            int temp = max(child); //Recursion on each node
            m = Math.max(temp, m);
        }
        m = Math.max(root.data, m);
        return m;
    }
}
