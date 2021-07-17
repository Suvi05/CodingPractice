package com.Scaler.Homework.Day11;

import java.util.HashSet;
import java.util.Scanner;

public class HQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings for Sudoku : ");
        String[] A = new String[9];
        for (int i = 0; i < 9; i++) {
            A[i] = sc.nextLine();
        }
        System.out.println(solve(A));
    }

    public static int solve(String[] A) {
        HashSet<String> hs = new HashSet<>();

        int box = 0;
        for (int i = 0; i < 9; i++) {  //ROW
            for (int j = 0; j < 9; j++) {  //COLUMN
                box = (i / 3) * 3 + (j / 3);
                if (A[i].charAt(j) != '.') {
                    if (!hs.add("row" + i + A[i].charAt(j)) || !hs.add("column" + j + A[i].charAt(j)) || !hs.add("board" + box + A[i].charAt(j))) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
