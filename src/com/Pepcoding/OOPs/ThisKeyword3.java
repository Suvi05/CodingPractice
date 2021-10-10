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

    public static class Rectangle {
        int x = 0, y = 0, h = 0, w = 0;

        public Rectangle() {
            this(1, 1);
        }

        public Rectangle(int h, int w) {
            this(0, 0, h, w);
        }

        public Rectangle(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
            this.printDimension();
            System.out.println();
        }

        public void printDimension() {
            System.out.println("Origin at : " + this.x + " , " + this.y);
            System.out.println("Dimension : " + this.h + " " + this.w);
        }
    }

    public static void main(String[] args) {
        Sum s0 = new Sum();
        Sum s1 = new Sum(10, 20);
        Sum s2 = new Sum(10, 20, 30);
        Sum s3 = new Sum(10, 20, 30, 40);
        System.out.println("************************");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        Rectangle r3 = new Rectangle(10, 20, 30, 40);
    }
}
