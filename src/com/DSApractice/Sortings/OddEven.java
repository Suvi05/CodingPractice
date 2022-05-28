package com.DSApractice.Sortings;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

//    public static void swap(int[] arr, int a, int b) {
//        //This swap method will give wrong output b/c for i=0 and j=0 it will set 0 in main array
          // Because XOR of same numbers is 0!
//        arr[a] = arr[a] ^ arr[b];
//        arr[b] = arr[a] ^ arr[b];
//        arr[a] = arr[a] ^ arr[b];
//    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
