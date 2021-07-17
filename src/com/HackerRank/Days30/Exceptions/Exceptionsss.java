package com.HackerRank.Days30.Exceptions;


import java.util.*;

class Calculator {
    int ans = 0;

    public Calculator() {
    }

    int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new RException("n and p should be non-negative");
        } else {
            return ans = (int) Math.pow(n, p);
        }
    }
}

class RException extends RuntimeException {
    RException(String message) {
        super(message);
    }
}

public class Exceptionsss {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}