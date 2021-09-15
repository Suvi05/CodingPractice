package com.DSApractice.Arrays.Arrays1D;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.print("Enter the Elements in Array : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the Rotation amount : ");
        int m = sc.nextInt();
        rotate(A, m);
    }

    public static void rotate(int[] A, int m) {
        int[] firsthalf = new int[A.length - m];
        for (int i = 0; i < A.length - m; i++) {
            firsthalf[i] = A[i];
        }
        int[] secondhalf = new int[m];
        for (int i = 0; i < m; i++) {
            secondhalf[i] = A[A.length - m + i];
        }
        reverse(firsthalf);
        reverse(secondhalf);
        int[] result = new int[A.length];
        for (int i = 0; i < A.length - m; i++) {
            result[i] = firsthalf[i];
        }
        for (int i = 0; i < m; i++) {
            result[A.length - m + i] = secondhalf[i];
        }
        reverse(result);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static void reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }
}