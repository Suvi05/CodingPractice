package com.Scaler.Assignment.Day15;

import java.util.Scanner;

public class AQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String A = sc.nextLine();
        System.out.print(isPalindrome(A));
    }

    public static int isPalindrome(String A) {
        if (A.length() <= 1) {
            return 1;
        }
        String first = A.substring(0, 1);
        String last = A.substring(A.length() - 1, A.length());
        //if (first != last) { //Not Working

        //++++ Description++++
        //The product uses the wrong operator when comparing a string,
        // such as using "==" when the .equals() method should be used instead.

        //++++ Extended Description++++
        //In Java, using == or != to compare two strings for equality actually compares two objects for equality
        // rather than their string values for equality. Chances are good that the two references will never be equal.
        // While this weakness often only affects program correctness, if the equality is used for a security decision,
        // the unintended comparison result could be leveraged to affect program security.
        if (!first.equals(last)) {
            return 0;
        } else {
            return isPalindrome(A.substring(1, A.length() - 1));
        }
    }
}
