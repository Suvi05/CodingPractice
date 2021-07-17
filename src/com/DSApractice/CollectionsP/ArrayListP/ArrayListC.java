package com.DSApractice.CollectionsP.ArrayListP;

import java.util.*;

public class ArrayListC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Number of Elements in A :");
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        System.out.print(" Number of Elements in B :");
        int m = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }
        System.out.println(A);
        System.out.println(B);

        ArrayListC obj = new ArrayListC();
        System.out.println("C: " + obj.solve(A, B));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        ArrayList<Integer> D = new ArrayList<Integer>();
        int count = 0;
        int flag = 0;

        for (int i = 0; i < A.size(); i++) {
            count += A.get(i);
            C.add(count);
        }
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) < C.get(0)) {
                D.add(0);
            } else {
                for (int j = 0; j < C.size(); j++) {

                    if (C.get(j) <= B.get(i)) {
                        flag++;
                    }
                }
                D.add(flag);
            }
        }
        return D;
    }
}

//-------- METHOD -  2
     /*   int flag = 0;
        int count = 0;

        ArrayList<Integer> C = new ArrayList<Integer>();

        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                count += A.get(j);
                if (count < B.get(i)) {
                    flag++;
                } else {
                    break;
                }
            }
            C.add(flag);
            flag = 0;
            count=0;
        }
        return C;*/

//------METHOD - 3
/*
*         ArrayList<Integer> C = new ArrayList<Integer>();
        ArrayList<Integer> D = new ArrayList<Integer>();
        int count = 0;
        int flag=0;

        for (int i = 0; i < A.size(); i++) {
            count += A.get(i);
            C.add(count);
        }
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) < C.get(0)) {
                D.add(0);
            } else {
                for (int j = 0; j < C.size(); j++) {

                    if (C.get(j) <= B.get(i)) {
                        flag++;
                    }
                }
                D.add(flag);
            }
        }
        return D;
        */