package com.DSApractice.Trees.GenericTrees;

import java.util.ArrayList;
import java.util.List;

public class GT1_GenericTreeIntro {
    static class Node {
        public int val;
        public List<Node> children = new ArrayList<>();
    }

    static class GenericTree {
        Node root;
    }

    public static void main(String[] args) {
        //Execute main code here
        //Or remove class Generic Type and write "Node root" here only.
    }
}
