package com.HackerRank.Days30.Exceptions;

import java.util.Scanner;

public class Exceptionss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        try{
        int x=Integer.valueOf(s);
            System.out.println(x);
        }
        catch (RuntimeException e){
            System.out.println("Bad String");
        }
    }
}
