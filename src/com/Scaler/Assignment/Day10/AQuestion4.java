package com.Scaler.Assignment.Day10;

import java.util.Scanner;

public class AQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();

        char[] B = A.toCharArray();
        int n = B.length;
        int count0 = 0;
        int count1 = 0;
        int large = 0;
        int largest = 0;

        for (int i = 0; i < n - 1; i++) {
            if (B[i] == '0') {
                count0++;
            }
            while (count0 > 0) {
                if (B[i] == '1') {
                    count1++;
                    if (B[i] == '1' && B[i + 1] == '1') {
                        large++;
                    }
                    if (n > large && count1 > large) {
                        largest = large + 1;
                    }
                }
            }
        }
        if (count0 < 2) {
            System.out.println(largest);
        } else {
            System.out.println(largest);
        }
    }
}
