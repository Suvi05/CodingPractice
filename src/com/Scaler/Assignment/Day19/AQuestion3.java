package com.Scaler.Assignment.Day19;

import java.util.Scanner;

//My Approach
public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {    //-7, 1, 5, 2, -4, 3
        int n = A.length;                 // n=6
        int[] P = new int[n];
        int[] S = new int[n];

        P[0] = A[0];                      //P[0]=A[0]=-7
        for (int i = 1; i < n; i++) {     // TRUE    i=1
            P[i] = P[i - 1] + A[i];       //P[1]=  -7 + 1 = -6 -1 1 -3 0
        }

        S[n - 1] = A[n - 1];              //S[5]=A[5]=3
        for (int i = n - 2; i >= 0; i--) {//TRUE    i=4
            S[i] = S[i + 1] + A[i];       //S[4]=S[5]+A[4]=3 + (-4) = -1
        }

        for (int i = 0; i < n; i++) {
            if (S[i] == P[i]) {
                return i;
            }
        }
        return -1;
    }
}
