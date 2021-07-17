package com.Scaler.Homework.Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HQuestion3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array : ");
        ArrayList<Integer> A = new ArrayList<>();
        while (sc.hasNextInt()) {
            A.add(sc.nextInt());
        }
        System.out.println(solve(A));
    }

    public static int solve(ArrayList A) {
        int minSteps = 0;
        Collections.sort(A);
        for (int j = 0; j < A.size(); j++) {
            for (int i = 0; i < A.size() - 1; i++) {
                if (A.get(i) != A.get(i + 1)) {
                    minSteps += 0;
                } else {
//                    Integer C = A.get(i)+1;
                    //                  A.set(i, C);
                    minSteps += 1;
                }
            }
        }
        return minSteps;
    }
}
