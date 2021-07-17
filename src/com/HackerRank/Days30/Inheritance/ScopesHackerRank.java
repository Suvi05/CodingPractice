package com.HackerRank.Days30.Inheritance;

import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] element) {
        this.elements = element;
    }

    int diff = 0;

    int computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                diff = elements[i] - elements[j];
                int z = Math.abs(diff);
                if (z > maximumDifference) {
                    maximumDifference = z;
                } else {
                    z = 0;
                }
            }
        }
        return maximumDifference;
    }
} // End of Difference class

public class ScopesHackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}