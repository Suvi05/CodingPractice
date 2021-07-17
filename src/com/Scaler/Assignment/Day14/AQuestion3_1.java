package com.Scaler.Assignment.Day14;
import java.util.Scanner;
public class AQuestion3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.println(solve(s, B));
    }
    public static String solve(String A, int B) {
        int C = B % A.length();

        String result = "";
        char[] ch = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            result = ch[i] + result;
        }
        String result1 = "";
        char[] ch1 = result.toCharArray();
        for (int i = 0; i < C; i++) {
            result1 = ch1[i] + result1;
        }
        String result2 = "";
        char[] ch2 = result.toCharArray();
        for (int i = C; i < A.length(); i++) {
            result2 = ch2[i] + result2;
        }
        return result1 + result2;
    }
}
