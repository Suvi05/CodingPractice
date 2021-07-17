package com.HackerRank.Days30.Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr2d = new int[x][y];
        int max = Integer.MIN_VALUE; //BECAUSE VALUE OF ANSWER COULD BE NEGATIVE TOO// THAT'S WHY NO '0'

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2d[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //------LOOP TO PRINT THE ELEMENTS OF THIS 2D ARRAY
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Arr [" + i + "],[" + j + "] = " + arr2d[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < x - 2; i++) {
            for (int j = 0; j < y - 2; j++) {
                int z = arr2d[i][j] + arr2d[i][j + 1] + arr2d[i][j + 2] + arr2d[i + 1][j + 1] + arr2d[i + 2][j] + arr2d[i + 2][j + 1] + arr2d[i + 2][j + 2];
                if (z > max) {
                    max = z;
                } else {
                    z = 0;
                }
            }
        }
        System.out.println(max);

    }

}