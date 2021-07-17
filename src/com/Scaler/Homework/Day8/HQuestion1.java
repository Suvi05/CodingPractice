package com.Scaler.Homework.Day8;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        String s = "";
        for (int i = 0; i < A.length; i++) {
            s += A[i];
        }
        Long a = 1 + Long.parseLong(s);
        System.out.println(a);
        s = Long.toString(a);
        String[] strings = s.split("");
        // char[] B= s.toCharArray();
        int[] C = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            C[i] = Integer.parseInt(strings[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
/* ---- FAULTY METHOD --------*/
/* if (A[n - 1] == 9) {
            A[n - 1] = 0;
            A[n - 2] = A[n - 2] + 1;
        } else {
            A[n - 1] = A[n - 1] + 1;
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }*/