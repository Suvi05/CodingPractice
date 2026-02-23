package com.DSApractice.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        System.out.println("Enter size of Array A:");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of Array A:");
        for (int i = 0; i < n1; i++) {
            A.add(sc.nextInt());
        }

        System.out.println("Enter size of Array B:");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of Array B:");
        for (int i = 0; i < n2; i++) {
            B.add(sc.nextInt());
        }
        //Add karega ye loop, elements ko HashMap me...
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (hm.containsKey(A.get(i))) {
                int of = hm.get(A.get(i));
                int nf = of + 1;
                hm.put(A.get(i), nf);
            } else {
                hm.put(A.get(i), 1);
            }
        }
        //Consume karwayega ye wala loop elements ko HashMap me se
        for (int i = 0; i < B.size(); i++) {
            if (hm.containsKey(B.get(i)) && hm.get(B.get(i)) > 0) {
                System.out.print(B.get(i) + " ");
                int of = hm.get(B.get(i));
                int nf = of - 1;
                hm.put(B.get(i), nf);
            }
        }
    }
}
