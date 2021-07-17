package com.HackerRank.Days30.StringsP;

import java.io.*;
import java.util.*;

public class StringsC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        int a = A.charAt(0);
        int b = B.charAt(0);
        //int a= Integer.valueOf(A.substring(0,1));
        //int b= Integer.valueOf(B.substring(0,1));
        if (a > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}




