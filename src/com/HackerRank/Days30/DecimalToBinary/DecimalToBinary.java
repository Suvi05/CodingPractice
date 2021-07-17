package com.HackerRank.Days30.DecimalToBinary;

import java.util.*;


public class DecimalToBinary {
    public static void main(String[] args) {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        while (n > 0) {
            int a = (n % 2);
            if (a == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else count = 0;

            n = n / 2;
        }
        System.out.println(max);
    }
}
//CODE TO PRINT THE BINARY VERSION OF DECIMAL NUMBERS//
/*        String x = "";
        while(n>0) {
            x += Integer.toString(n % 2);
            n = n / 2;
        }
        // String z=x.replaceAll("\\.0*$", "");

        StringBuilder y = new StringBuilder();
        y.append(x);
        y.reverse();
        System.out.println(y);

//        bufferedReader.close();
    }
}
*/