package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GT16_LowestCommonAncestorGenericTree {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int n2 = sc.nextInt();
        System.out.println("Lowest Common Ancestor is : " + lowestCommonAncestor(root, n1, n2));

    }

    public static ArrayList<Integer> nodeToRoot(Node root, int n) {
        if (root.val == n) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(root.val);
            return result;
        }
        for (Node child : root.children) {
            ArrayList<Integer> printTillChild = nodeToRoot(child, n);
            if (printTillChild.size() > 0) {
                printTillChild.add(root.val);
                return printTillChild;
            }
        }
        return new ArrayList<>();
    }

    public static int lowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Integer> arr1 = nodeToRoot(root, n1);
        ArrayList<Integer> arr2 = nodeToRoot(root, n2);

        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        while (i >= 0 && j >= 0 && arr1.get(i) == arr2.get(j)) {
            i--;
            j--;
        }
        i++;
        j++;
        return arr1.get(i);
    }
}
//Remove Print Add Children