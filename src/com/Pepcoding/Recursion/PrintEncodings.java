package com.Pepcoding.Recursion;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String ans) {
        //"Zero dikhe toh skip
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        //Ek bacha toh sidha map
        else if (ques.length() == 1) {
            char ch = ques.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char charCode = (char) ('a' + chv - 1);
                System.out.println(ans + charCode);
            }
        }
        //do ya zyada bache toh dono tarah try kar
        else {
            //Pehle ek digit leke map karo (agar '0' nahi hai).
            char ch = ques.charAt(0);
            String rem = ques.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char charCode = (char) ('a' + chv - 1);
                printEncodings(rem, ans + charCode);
            }

            //Phir do digit leke map karo (agar value 26 se chhoti ya barabar hai).
            String ch12 = ques.substring(0, 2);
            String rem12 = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char charCode = (char) ('a' + ch12v - 1);
                printEncodings(rem12, ans + charCode);
            }
        }
    }
}
