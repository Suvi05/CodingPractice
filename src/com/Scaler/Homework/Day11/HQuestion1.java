package com.Scaler.Homework.Day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Permuations of String A
        System.out.print("Enter the First String :");
        String A = sc.nextLine();
        int n = A.length();
        ArrayList<String> Astr = new ArrayList<>();
        int fact = factorial(n);
        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(A);
            StringBuilder str = new StringBuilder();
            int temp = i;
            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;

                str.append(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            Astr.add(str.toString());
        }

        /*for (String s : Astr) {
            System.out.println(s);
        }*/

//Permutations Of String B
        System.out.print("Enter the Second String :");
        String B = sc.nextLine();
        int m = B.length();
        ArrayList<String> Bstr = new ArrayList<>();

        for (int i = 0; i < m - n; i++) {
            Bstr.add(B.substring(i, i + n));
        }

        int N = Astr.size();
        int M = Bstr.size();
//Finding Common elements in both of the Array Lists --- i.e. A and B
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//LOOP FOR KEEPING TRACK OF FREQUENCY OF EACH ELEMENT IN LOOP B
        for (int i = 0; i < M; i++) {
            if (hm.containsKey(Bstr.get(i))) {
                int of = hm.get(Bstr.get(i));
                int nf = of + 1;
                hm.put(Bstr.get(i), nf);
            } else {
                hm.put(Bstr.get(i), 1);
            }
        }
//LOOP FOR KEEPING TRACK OF FREQUENCY DEDUCTION OF EACH ELEMENT IN LOOP B WHILE WE FOUND IT IN LOOP A
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(Astr.get(i))) {
                count++;
                /*int of = hm.get(Astr.get(i));
                int nf = of - 1;
                hm.put(Astr.get(i), nf);*/
            }
        }
        System.out.println(count);
    }

    public static int factorial(int N) {
        int val = 1;
        for (int i = 2; i <= N; i++) {
            val *= i;
        }
        return val;
    }
}
