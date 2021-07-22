package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (A[i] > secondLargest) {
                secondLargest = A[i];
                if (secondLargest > largest) {
                    secondLargest = largest;
                    largest = A[i];
                }
            }
        }
        int[] C = new int[n - 2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < secondLargest) {
                C[k] = A[i];
                k++;
            }

        }
        System.out.println("Largest " + largest);
        System.out.println("Second Largest " + secondLargest);
        for (int x : C) {
            System.out.print(" " + x);
        }
    }
}
