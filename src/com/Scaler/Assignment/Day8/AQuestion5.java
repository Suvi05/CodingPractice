package com.Scaler.Assignment.Day8;

import java.util.Scanner;

public class AQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Test cases : ");
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {

            System.out.println("Enter the Size of Array : ");
            int size = sc.nextInt();
            int[] A = new int[size];
            System.out.println("Enter the elements in Array : ");
            for (int j = 0; j < size; j++) {
                A[j] = sc.nextInt();
            }

            System.out.println("Enter the Value of K : ");
            int k = sc.nextInt();
//reverse from 0 to n-1
            k = k % size;
            int l = 0;
            int r = size - 1;
            while (l < r) {
                swap(A, l, r);
                l++;
                r--;
            }

            l = 0;
            r = k - 1;
            while (l < r) {
                swap(A, l, r);
                l++;
                r--;
            }

            l = k;
            r = size - 1;
            while (l < r) {
                swap(A, l, r);
                l++;
                r--;
            }
            for (int n = 0; n < size; n++) {
                System.out.print(A[n] + " ");
            }
            System.out.println();

        }

    }

    public static void swap(int[] A, int i, int i1) {
        int temp = A[i];
        A[i] = A[i1];
        A[i1] = temp;
    }
}
   /* static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
       /* System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }*/

