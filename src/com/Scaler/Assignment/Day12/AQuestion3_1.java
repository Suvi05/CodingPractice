package com.Scaler.Assignment.Day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AQuestion3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
    }

    public static int[] solve(int[] A) {
        int[] result = new int[4];
        HashMap<Integer, ArrayList<Integer[]>> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (hm.containsKey(A[i] + A[j])) {
                    Integer[] temp = new Integer[2];
                    temp[0] = i;
                    temp[1] = j;
                    hm.get(A[i] + A[j]).add(temp);

                } else {
                    Integer[] temp = new Integer[2];
                    temp[0] = i;
                    temp[1] = j;
                    ArrayList<Integer[]> arr = new ArrayList<>();
                    arr.add(temp);
                    hm.put((A[i] + A[j]), arr);
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                ArrayList<Integer[]> arr = hm.get(sum);
                for (int k = 0; k < arr.size(); k++) {
                    if (i != arr.get(k)[0] && j != arr.get(k)[1] && j != arr.get(k)[0]) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = arr.get(k)[0];
                        result[3] = arr.get(k)[1];
                        for (int d : result) {
                            System.out.print(d + " ");
                        }
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
// 3 4 7 1 2 9 8