package com.Scaler.Assignment.Day8;

import java.util.Scanner;

public class AQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B=new int[n];
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                B[i]=0;
            }
            else{
                B[i]=1;
            }
        }
        int pre=B[0];
        int count=1;
        int temp=0;
        for(int i=0;i<n-1;i++){
            if(pre !=B[i+1]){
                count++;
                pre=B[i+1];
            }
        }
        System.out.println(count);
    }
}
