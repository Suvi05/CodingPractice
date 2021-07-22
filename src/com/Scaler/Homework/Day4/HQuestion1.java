package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int x : A) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : A) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
        int k = 0;
        for (int x : A) {
            if (x != max && x != min) {
                k++;
            }
        }
        return k;
    }
}

//12--- 913 440 865  612 445 101 994 356 91 461 930 583 ---> 10 ans
//17--- 448 543 170 333 107 425 72 73 172 416 899 826 659 561 314 25 110 ---> 15 ans

