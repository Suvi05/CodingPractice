package com.Scaler.Homework.Day14;

import java.util.Scanner;

public class HQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder A = new StringBuilder(sc.nextLine());
        System.out.println(solve(A));
    }

    public static String solve(StringBuilder A) {

        StringBuilder st = new StringBuilder(A);
        StringBuilder sp = new StringBuilder();
        st.append(A);
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) > 64 && st.charAt(i) < 91) {
                st.deleteCharAt(i);
                i--;
            }
        }
        String s = st.toString();
        char[] ch = s.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ch[i] = '#';
            }
            sp.append(ch[i]);
        }
        return sp.toString();
    }
}
//AbcaZeo
//lLdfRVCgbkND