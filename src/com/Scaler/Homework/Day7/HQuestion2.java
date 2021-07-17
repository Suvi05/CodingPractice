package com.Scaler.Homework.Day7;

import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        int x = largestPowerOf2(n);
        int upto2square = x * (1 << (x - 1));
        int afterSquare = (n - (1 << x) + 1);
        int rest = n - (1 << x);
        int ans = upto2square + afterSquare + solution(rest);
        return ans;
    }

    public static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}
