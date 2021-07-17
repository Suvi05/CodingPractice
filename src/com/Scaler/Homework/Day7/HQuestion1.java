package com.Scaler.Homework.Day7;

import java.util.Scanner;

//------METHOD FOR SMALL CALCULATIONS
public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        String A = sc.nextLine();
        System.out.print("Enter Second Number : ");
        String B = sc.nextLine();

        int i = A.length();
        int j = B.length();
        int sum = 0;
        int carry = 0;
        while (i >= 0 || j >= 0 ||carry>0) {
            sum =  carry;
            if(i>=0){
                sum+= 'i'-'0';
            }
            if(j>=0){
                sum+= 'i'-'0';
            }
        }
    }
}
