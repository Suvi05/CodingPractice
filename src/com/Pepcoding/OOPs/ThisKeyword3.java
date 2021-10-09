package com.Pepcoding.OOPs;

public class ThisKeyword3 {
    public static class Sum {

        public Sum() {
            //Overridden Default Constructor
            this(0, 0); //Constructor Chaining
        }

        public Sum(int a, int b) {
            this(a, b, 0);//Constructor Chaining
        }

        public Sum(int a, int b, int c) {
            this(a, b, c, 0);//Constructor Chaining
        }

        public Sum(int a, int b, int c, int d) {
            System.out.println("Your answer is : " + (a + b + c + d));
        }
    }

    public static void main(String[] args) {
        Sum s0 = new Sum();
        Sum s1 = new Sum(10, 20);
        Sum s2 = new Sum(10, 20, 30);
        Sum s3 = new Sum(10, 20, 30, 40);
    }
}
