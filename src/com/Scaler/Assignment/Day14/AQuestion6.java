package com.Scaler.Assignment.Day14;

import java.util.Scanner;

public class AQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        char[] A = s.toCharArray();
        System.out.println(solve(A));
    }

    public static int solve(char[] A) {
        for (int i = 0; i < A.length; i++) {
            if (!(A[i] > 63 && A[i] < 91) && !(A[i] > 96 && A[i] < 123) && !(A[i] > 47 && A[i] < 58)) {
                return 0;
            }
        }
        return 1;
    }
}
/*
*   // if ((A[i] >= 65 && A[i] <= 90) || (A[i] >= 97 && A[i] <= 122) || (A[i] >= 48 && A[i] <= 57)) {
            //if ((A[i] >= 'a' && A[i] <= 'z') || (A[i] >= 'A' && A[i] <= 'Z') || (A[i] >= '0' && A[i] <= '9')) {
//           if ((!(c >= 'a')) && (!(c <= 'z')) && (!(c >= 'A')) && (!(c <= 'Z')) && (!(c >= '0')) && (!(c <= '9'))) {
//  if(!(A[i] >= 64 && A[i] <= 90) || !(A[i] >= 97 && A[i] <= 122) || !(A[i] >= 48 && A[i] <= 57)){
* */