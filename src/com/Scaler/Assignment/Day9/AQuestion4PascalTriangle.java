package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestion4PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row Number : ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        //----PASCAL'S TRIANGLE
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                if(i==j || j==0){
                    System.out.print( A[i][j]=1);
                }
                else{
                    //System.out.println(0);
                    System.out.print(A[i][j]=A[i-1][j-1]+A[i-1][j]);
                }
            }
            System.out.println();
        }
    }
}
