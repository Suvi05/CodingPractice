package com.DSApractice.Basic;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int one = 0;
        int zero = 0;
        int count = 0;
        int maxCount = 0;

        char B[] = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            B[i] = A.charAt(i);
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] == '1') {
                one++;
            } else {
                zero++;
            }
            if (one == zero) {
                count++;
            }
        }
        System.out.println(count);

      /*  int C = B.length;

        while (C > 0) {
         /*   if (one == zero) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                } else {
                    count = 0;
                }
            }
            System.out.print(maxCount);
            C--;
        }*/
        //----- LOOP TO PRINT THE ELEMENTS IN CHARACTER ARRAY-----
/*        for (char C : B) {
            System.out.print(C);
        }*/
    }
}
