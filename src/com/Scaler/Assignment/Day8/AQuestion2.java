package com.Scaler.Assignment.Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int n = sc.nextInt();
        ArrayList<String> A = new ArrayList();
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            if (x % 15 == 0) {
                A.add(i, "FizzBuzz");
            } else if (x % 5 == 0) {
                A.add(i, "Buzz");
            } else if (x % 3 == 0) {
                A.add(i, "Fizz");

            } else {
                A.add(i, Integer.toString(x));
            }
        }
        System.out.println(A);
    }
}
