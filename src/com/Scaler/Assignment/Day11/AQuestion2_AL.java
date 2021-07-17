package com.Scaler.Assignment.Day11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AQuestion2_AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int N = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(i, sc.nextInt());
        }
        System.out.print("Enter the size of the Array : ");
        int M = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            B.add(i, sc.nextInt());
        }
        Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(A.get(i))) {
                int of = hm.get(A.get(i));
                int nf = of + 1;
                hm.put(A.get(i), nf);
            } else {
                hm.put(A.get(i), 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if (hm.containsKey(B.get(i)) && hm.get(B.get(i)) > 0) {
               // System.out.print(B.get(i) + " ");
                result.add(B.get(i));
                int of = hm.get(B.get(i));
                int nf = of - 1;
                hm.put(B.get(i), nf);
            }
        }
        for(int s:result){
            System.out.println(s);
        }
    }
}
   /*Enter the size of the Array:4
           Enter the elements of Array:2 1 4 10
           Enter the size of the Array:5
           Enter the elements of Array:3 6 2 10 10*/