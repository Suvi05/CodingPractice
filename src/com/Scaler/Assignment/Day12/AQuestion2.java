package com.Scaler.Assignment.Day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> hm = new LinkedHashMap<>();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += A[i];
            if (hm.containsKey(sum) || sum == 0) {
                System.out.println("true");
                hm.put(sum, true);
            }
        }
    }
}
