package com.Scaler.Homework.Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HQuestion2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array : ");
        ArrayList<Integer> A = new ArrayList<>();
        while (sc.hasNextInt()) {
            A.add(sc.nextInt());
        }
        System.out.println(solve(A));
        for (int h : A) {
            System.out.print(h);
        }
    }

    public static String solve(ArrayList A) {
        List<Integer> B = A;
        String result = "";
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                String s1 = A.get(i).toString();
                String s2 = A.get(j).toString();
                String s3 = s1 + s2;
                String s4 = s2 + s1;
                if (s3.compareTo(s4) < 0) {
                    int temp = (int) A.get(i);
                    int temp2 = (int) A.get(j);
                    A.set(i, temp2);
                    A.set(j, temp);
                }
            }
            result += A.get(i).toString();
        }
        return result.startsWith("0") ? "0" : result;
    }
}
