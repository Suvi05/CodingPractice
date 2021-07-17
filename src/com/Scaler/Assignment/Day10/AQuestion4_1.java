package com.Scaler.Assignment.Day10;

import java.util.Scanner;

public class AQuestion4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();

        char[] B = A.toCharArray();
        int n = B.length;
        int j = -1;
        int ans = 0;
        int zcount = 0;
        for (int i = 0; i < n; i++) {
            if (B[i] == '0') {
                zcount++;
            }
            while (zcount > 2) {
                j--;
                if (B[j] == 0) {
                    zcount--;
                }
            }
            int len = i - j;
            if (len > ans) {
                ans = len;
            }
        }
        System.out.println(ans);
    }
}
