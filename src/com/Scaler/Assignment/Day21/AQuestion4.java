package com.Scaler.Assignment.Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class AQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.print("Enter C : ");
        int C = sc.nextInt();
        System.out.print("Enter D : ");
        int D = sc.nextInt();
        solve(A, B, C, D);
    }

    public static void solve(int A, int B, int C, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        int k = 0;
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < s; i++) {
            k++;
            if (k % A == 0 || k % B == 0 || k % C == 0) {
                result.add(k);
            }
            if (result.size() >= D) {
                break;
            }
        }
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
}
