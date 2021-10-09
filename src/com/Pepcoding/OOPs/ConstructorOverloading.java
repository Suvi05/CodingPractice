package com.Pepcoding.OOPs;

public class ConstructorOverloading {
    public static class Rectangle {
        int h, l, w;

        public Rectangle() {
            //Default Constructor
        }

        public Rectangle(int h) { //1 Parameter Constructor
            this.h = h;
            this.l = h;
            this.w = h;
        }

        public Rectangle(int h, int l, int w) { //3 Parameter Constructor
            this.h = h;
            this.l = l;
            this.w = w;
        }

        public int volume() {
            return h * l * w;
        }

        public int surfaceArea() {
            return 2 * (h * l + l * w + h * w);
        }

        public static void test() {
            Rectangle rc = new Rectangle(10, 5, 12);
            System.out.println("Volume is : " + rc.volume());
            System.out.println("Surface Area is : " + rc.surfaceArea());

            Rectangle rc1 = new Rectangle();
            System.out.println("Volume is : " + rc1.volume());
            System.out.println("Surface Area is : " + rc1.surfaceArea());

            Rectangle rc2 = new Rectangle(10);
            System.out.println("Volume is : " + rc2.volume());
            System.out.println("Surface Area is : " + rc2.surfaceArea());

        }

        public static void main(String[] args) {
            test();
        }
    }
}
