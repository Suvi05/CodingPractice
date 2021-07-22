package com.DSApractice.Mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int A = sc.nextInt();
        solve(A);
    }

    public static void solve(int A) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int D = A;
//Point to remember -- Never take that variable in loop testing whose value is getting changed inside loop's body
        for (int i = 2; i * i <= D; i++) {
            while (A % i == 0) {
                primeFactors.add(i);
                A = A / i;
            }
        }
        if (A > 1) {
            primeFactors.add(A);
        }
        for (int d : primeFactors) {
            System.out.print(d + " ");
        }
    }
}
