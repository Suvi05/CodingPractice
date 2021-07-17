package com.DSApractice.Sortings;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting Runs:");
        for (int i = 1; i < arr.length-1; i++) {
            int value = arr[i];
            int index = i;
            while (index > 0 && arr[index-1] > value) {
                arr[index] = arr[index - 1];
                arr[index] = value;
            }
            System.out.print(arr[index]+" ");
        }
    }
}
