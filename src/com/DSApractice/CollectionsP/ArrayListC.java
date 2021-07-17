package com.DSApractice.CollectionsP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. elements in Array List you want : ");
        int n = sc.nextInt();

        List<Integer> arrList = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arrList.add(i);
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        System.out.println("Size of Array List is : " + arrList.size());
        arrList.remove(3);
        System.out.print(arrList);
        System.out.println("");
        System.out.println("Size of Array List is : " + arrList.size());
    }
}
