package com.DSApractice.Arrays.Arrays1D;

public class TwoMaximums {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] result = new int[A.length - 2];
        result = solve(A);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] solve(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int val : A) {    //Loop to find 2 Maximums
            if (val > max1) {
                max1 = val;
                val = max2;
                max2 = max1;
            }
        }
        int[] result = new int[A.length - 2];
        int i = 0;
        for (int val : A) {
            if (val != max1 && val != max2) {
                result[i] = val;
                i++;
            }
        }
        return result;
    }
}
/*
* public class Solution {
    public int[] solve(int[] A) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int val:A){    //Loop to find 2 Maximums
            max1=Math.max(max1,val);  //1
            if(val<max1 && val>max2){
                max2= Math.max(max2,val);
            }
        }
        int[] result=new int[A.length-2];
        int i=0;
        for(int val:A){
            if(val!= max1 && val!=max2){
                result[i]=val;
                i++;
            }
        }
        return result;
    }
}

* */


//(10001100010111000101100010100110001001101010000010011010)₂ = (1 × 2⁵⁵) + (0 × 2⁵⁴) + (0 × 2⁵³) + (0 × 2⁵²) + (1 × 2⁵¹) + (1 × 2⁵⁰) + (0 × 2⁴⁹) + (0 × 2⁴⁸) + (0 × 2⁴⁷) + (1 × 2⁴⁶) + (0 × 2⁴⁵) + (1 × 2⁴⁴) + (1 × 2⁴³) + (1 × 2⁴²) + (0 × 2⁴¹) + (0 × 2⁴⁰) + (0 × 2³⁹) + (1 × 2³⁸) + (0 × 2³⁷) + (1 × 2³⁶) + (1 × 2³⁵) + (0 × 2³⁴) + (0 × 2³³) + (0 × 2³²) + (1 × 2³¹) + (0 × 2³⁰) + (1 × 2²⁹) + (0 × 2²⁸) + (0 × 2²⁷) + (1 × 2²⁶) + (1 × 2²⁵) + (0 × 2²⁴) + (0 × 2²³) + (0 × 2²²) + (1 × 2²¹) + (0 × 2²⁰) + (0 × 2¹⁹) + (1 × 2¹⁸) + (1 × 2¹⁷) + (0 × 2¹⁶) + (1 × 2¹⁵) + (0 × 2¹⁴) + (1 × 2¹³) + (0 × 2¹²) + (0 × 2¹¹) + (0 × 2¹⁰) + (0 × 2⁹) + (0 × 2⁸) + (1 × 2⁷) + (0 × 2⁶) + (0 × 2⁵) + (1 × 2⁴) + (1 × 2³) + (0 × 2²) + (1 × 2¹) + (0 × 2⁰) = (39508032553918618)₁₀
