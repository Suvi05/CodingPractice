package com.Scaler.Assignment.Day10;

import java.util.Scanner;

import static java.lang.Integer.min;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        if(min==max){
            System.out.println(1);;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                for (int j = i + 1; j < n; j++) {
                    if (A[j] == max) {
                        ans = min(ans, (j - i + 1));
                        break;
                    }
                }
            } else {
                if (A[i] == max) {
                    for (int j = i + 1; j < n; j++) {
                        if (A[j] == min) {
                            ans = min(ans, (j - i + 1));
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
