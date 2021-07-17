package com.DSApractice.MathC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AreaUnderHills {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Points: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        AreaUnderHills obj = new AreaUnderHills();
        System.out.println(obj.solve(A));
    }

    public String solve(ArrayList<Integer> A) {
        double area = 0;
        String s = "";

        A.add(0, 0);
        int last = A.size();
        A.add(last, 0);

        for (int i = 0; i < A.size()-1; i++) {
            area += (((double)A.get(i) + (double)A.get(i+1)) / 2);
        }
        int areaa= (int)area;
        s = Integer.toString(areaa);
        return s;
    }

}
//--------METHOD - 2 ------
/*
 public String solve(ArrayList<Integer> A) {
        double area = 0;
        String s = "";

        for(int i=0;i<A.size();i++){
            area+= A.get(i);
        }
        long areaa= (long)area;
        s = Long.toString(areaa);
        return s;
    }*/