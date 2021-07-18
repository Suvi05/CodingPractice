package com.Scaler.Homework.Day13;

import java.util.*;

public class HQuestion5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array : ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the B : ");
        int B = sc.nextInt();

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int fdiff = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                int of = hm.get(A[i]);
                int nf = of + 1;
                hm.put(A[i], nf);
            } else {
                arr.add(A[i]);
                hm.put(A[i], 1);
            }
        }
        int max = arr.size() - 1;
        int min = 0;

        while (B > 0 && min < max) {
            if (hm.get(arr.get(max)) > hm.get(arr.get(min))) {
                if ((B - (arr.get(min + 1) - arr.get(min)) * hm.get(arr.get(min))) >= 0) {
                    B = B - (arr.get(min + 1) - arr.get(min)) * hm.get(arr.get(min));
                    hm.put(arr.get(min + 1), hm.get(arr.get(min)) + hm.get(arr.get(min + 1)));
                    min = min + 1;
                } else {
                    fdiff = arr.get(max) - (arr.get(min) + B / hm.get(arr.get(min)));
                    break;
                }
            } else {
                if (B - (arr.get(max) - arr.get(max - 1)) * hm.get(arr.get(max)) >= 0) {
                    B = B - (arr.get(max) - arr.get(max - 1)) * hm.get(arr.get(max));
                    hm.put(arr.get(max - 1), hm.get(arr.get(max)) + hm.get(arr.get(max - 1)));
                    max = max - 1;
                } else {
                    fdiff = (arr.get(max) - B / hm.get(arr.get(max)) - arr.get(min));
                    break;
                }
            }
            // System.out.println(min+" "+ max+" "+B);
        }
        if (B == 0) {
            fdiff = arr.get(max) - arr.get(min);
        }
        return fdiff;
    }
}
//5
//2 8 6 9 3
//3 -- 5
//4 6 3 1 4
//5 -- 1