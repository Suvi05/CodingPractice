//----------//METHOD -3 Optimized by n^(1/2)
package com.DSApractice.Basic;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        long start=System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= (n^(1/2)); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Not Prime/Composite");
        } else {
            System.out.println("Prime");
        }
        long end=System.currentTimeMillis();
        System.out.println("Time Taken: "+ ((end-start)/1000)+ "Seconds");
        sc.close();
    }
}
//----------//METHOD -2 Optimized by n/2
/*package com.DSApractice;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= (n/2); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Not Prime/Composite");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }
}*/

//----------/*METHOD -1 - Normal Method i.e(Divide number by 1 to N)*/

/*package com.DSApractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
             if (n % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("Not Prime/Composite");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }
}
*/