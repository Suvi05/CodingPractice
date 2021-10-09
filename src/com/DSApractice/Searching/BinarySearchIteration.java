package com.DSApractice.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
        int s = sc.nextInt();
        BinarySort(arr, s);
    }

    public static void BinarySort(int[] A, int s) {
        Arrays.sort(A);
        int lo = 0;
        int hi = A.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; //(hi - lo) / 2 - Same
            if (A[mid] == s) {
                System.out.println(mid);
                return;
            } else if (A[mid] < s) {
                lo = mid + 1;
            } else if (A[mid] > s) {
                hi = mid - 1;
            }
        }
        System.out.println("Not Found");
    }
}
