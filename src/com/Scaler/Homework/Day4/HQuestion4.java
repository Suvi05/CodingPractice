package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HQuestion4 obj = new HQuestion4();
        System.out.println(obj.solve(n));
    }

    int solve(int A) {
        int[][] B = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                B[i][j] = j+1;
            }
        }
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) { //We can use i in place of A to get METHOD -2's output too...
                //BUT IN SCALER'S CODE IT IS WRITTEN LIKE ABOVE ONE ONLY
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
        return 1;
    }
}

//------ METHOD - 2----- Without O
/* int[][] B = new int[A][];
        for (int i = 0; i < A; i++) {
        int [] arr= new int[i+1];
        for (int j = 0; j <= i; j++) {
        arr[j] = j+1;
        }
        B[i]=arr;
        }
        return B;
        } */