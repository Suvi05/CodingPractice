package com.Scaler.Assignment.Day9;

import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Rows : ");
        int a = sc.nextInt();
        System.out.print("Enter size of Column : ");
        int b = sc.nextInt();

        int[][] A = new int[a][b];
        //----LOOPS TO TAKE INPUT IN 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //----LOOPS TO PRINT INPUT OF 2-D ARRAY
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //----LOOP TO PRINT THE DESIRED OUTPUT
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int count = i+j;
                if(count < Math.pow(a,2)) {
                    System.out.println(A[i][j]);
                }
                count++;
            }
             // System.out.println();
        }
    }
}

/*
00    //0

01   //1
10   //1

02   //2
11   //2
20   //2

12   //3
21   //3

22  //4
*/