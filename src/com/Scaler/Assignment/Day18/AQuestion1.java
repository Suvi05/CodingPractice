package com.Scaler.Assignment.Day18;

import java.util.HashMap;
import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.println("Enter the Elements in 2D Array : ");
        int[][] B = new int[3][3];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(A, B));
    }

    public static int[] solve(int A, int[][] B) {
        int[] result = new int[A];
        //    j=0  1  2
        //B = [[1, 2, 10]
        //    [2, 3, 20]
        //    [2, 5, 25]]
        HashMap<Integer, Integer> hm = new HashMap<>();
        //Begger Number, Money
        //   int MoneySum=0;
        for (int i = 0; i < B.length; i++) {   //Loop for queries
            for (int j = B[i][0] - 1; j < B[i][1]; j++) {
                result[j] += B[i][2];
                // hm.put(j, MoneySum + B[i][2]);
            }
        }
        /*for(int i=1;i<=A;i++){
            result[i]=hm.get(i);
        }*/
        return result;
    }
}