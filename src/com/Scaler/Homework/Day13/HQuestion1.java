package com.Scaler.Homework.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int[] solve(int[] A) {
        //int[] res = new int[A.length];
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i = i + 2) {
            if(i%2==0){
                int temp=A[i+1];
                A[i+1]=A[i];
                A[i]=temp;

            }else {
                int temp=A[i+1];
                A[i+1]=A[i];
                A[i]=temp;
            }
        }
        return A;
    }
}
