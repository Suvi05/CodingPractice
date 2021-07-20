package com.Scaler.Assignment.Day16;

import java.util.*;

public class AQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in Array : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //  solve(a);
    }
}
//public static void solve(int[] arr) {
  /*      for (int i = 0; i < a.size(); i++) {

            int index = a.get(i);
            int val = a.get(index) % a.size() + 1;
            a.set(i, a.get(i) + a.size() * val);
        }
        for (int i = 0; i < a.size(); i++) {
            int val = a.get(i);
            val = val / a.size() - 1;
            a.set(i, val);
        }

    }
}
/* --Another Approch
 int n = A.size();
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
*/

//Approches
 /*Integer[] A = new Integer[a.size()];
        A = a.toArray(A);

	  // create an auxiliary array of the same size as `A[]`
        int[] aux = new int[A.length];

        // for each element `A[i]`, set value `i` at index `A[i]`
        // in the auxiliary array
        for (int i = 0; i < A.length; i++) {
            aux[A[i]] = i;
        }

        // update original array with auxiliary array elements
        for (int i = 0; i < A.length; i++) {
            A[i] = aux[i];
        }
        System.out.println(Arrays.toString(A));
	}
}
	   /* int n=a.size();
	    Integer[] arr = new Integer[a.size()];
        arr = a.toArray(arr);

        // First step: Increase all values by (arr[arr[i]]%n)*n
        for (int i = 0; i < n; i++)
            arr[i] += (arr[arr[i]] % n) * n;

        // Second Step: Divide all values by n
        for (int i = 0; i < n; i++)
            arr[i] /= n;

        for (int i = 0; i < a.size(); i++)
        System.out.print(arr[i] + " ");
        System.out.println("");
	}
}*/