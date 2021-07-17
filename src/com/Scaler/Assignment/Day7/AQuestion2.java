package com.Scaler.Assignment.Day7;

import java.util.Scanner;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put number: ");
        long n = sc.nextLong();
        String num = "";

        while (n > 0) {
            num += Long.toString(n % 2);
            n = n / 2;
        }

        StringBuilder y = new StringBuilder();
        y.append(num);
        y.reverse();
        System.out.println(y);
        System.out.println(y.length());

        char[] ch = num.toCharArray();
        int count = 0;
        System.out.println(ch.length);


        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
//---------METHOD - 2 --------------------
/*  String s="";
        int count=0;

        while(n>0){
            s+= Integer.toString(n%2);
            n= n/2;
        }
        char[] A= s.toCharArray();

        for(int i=0;i<A.length;i++){
            if(A[i]=='1'){
                count++;
            }
        }
        return count;*/