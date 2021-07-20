package com.HackerRank.Days30.DecimalToBinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//CODE TO PRINT THE BINARY VERSION OF DECIMAL NUMBERS//
public class DecimalToBinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String x = "";
        while (n > 0) {
            x += Integer.toString(n % 2);
            n = n / 2;
        }
        String z = x.replaceAll("\\.0*$", "");

        StringBuilder y = new StringBuilder();
        y.append(x);
        y.reverse();
        System.out.println(y);

        bufferedReader.close();
    }
}
