package com.DSApractice.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter the Elements in Array A: ");
        while (sc.hasNextInt()) {
            A.add(sc.nextInt());
        }
        sc.nextLine();
        ArrayList<Integer> B = new ArrayList<>();
        System.out.println("Enter the Elements in Array B: ");
        sc.nextLine();
        while (sc.hasNextInt()) {
            B.add(sc.nextInt());
        }
        sc.nextLine();
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
