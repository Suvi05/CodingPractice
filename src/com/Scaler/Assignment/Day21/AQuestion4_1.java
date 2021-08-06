package com.Scaler.Assignment.Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class AQuestion4_1 {
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
        result.add(1);
        int i = 0;
        int j = 0;
        int k = 0;
        while (D > 0) {
            int ans = Math.min(result.get(i) * A, Math.min(result.get(j) * B, result.get(k) * C));
            result.add(ans);
            if (ans == result.get(i) * A) i++;
            if (ans == result.get(j) * B) j++;
            if (ans == result.get(k) * C) k++;
            D--;
        }
        result.remove(0);
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
}
