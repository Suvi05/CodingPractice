package com.Scaler.Homework.Day6;

import java.util.Scanner;

public class HQuestion1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        String A = sc.nextLine();
        System.out.print("Enter Second Number : ");
        String B = sc.nextLine();

        char[] A1 = A.toCharArray();
        int[] A2 = new int[A1.length];
        for (int i = 0; i < A1.length; i++) {
            A2[i] = Character.getNumericValue(A1[i]);
        }

        char[] B1 = B.toCharArray();
        int[] B2 = new int[B1.length];
        for (int i = 0; i < B1.length; i++) {
            B2[i] = Character.getNumericValue(B1[i]);
        }

        int n1 = A2.length;
        int n2 = B2.length;

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;

        int i = A.length() - 1;
        int j = B.length() - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += A2[i];
            }

            if (j >= 0) {
                d += B2[j];
            }
            c = d / 2;
            d = d % 2;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        String s="";
        if (c != 0) {
            s+=c;
        }
        for (int val : sum) {
            s+=val;
        }
        String[] ans=new String[1];
        ans[0]=s;
    }
}
