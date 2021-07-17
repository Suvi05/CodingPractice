package com.Scaler.Homework.Day4;

import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements in Array A : ");
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x:A){
            if(x<min){
                min=x;
            }
        }
        for(int x:A){
            if(x>max){
                max=x;
            }
        }

        System.out.println("Max "+ max);
        System.out.println("Min "+ min);
        int k=0;
        for(int x:A){
            if(x!=max && x!=min){
                k++;
            }
        }
        System.out.println(k);
    }
}
//913, 440, 865,  612, 445, 101, 994, 356, 91, 461, 930, 583,
//448, 543, 170, 333, 107, 425,72, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110

