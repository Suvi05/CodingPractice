package com.Scaler.Assignment.Day13;

import java.util.Scanner;

public class AQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array :");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int[] solve(int[] A) {
        int[] result = new int[A.length - 1];
        int n = A.length;
        int k = 0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (A[j] < A[min_idx]) min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = A[min_idx];
            A[min_idx] = A[i];
            A[i] = temp;
            result[k] = min_idx;
            k++;
        }
        return result;
    }
}