package com.Pepcoding.OOPs;

public class ThisKeyword2 {
    public static class Phone {
        String brand = "";
        String model = "";
        int ram = 0;

        public Phone(String brand, String model, int ram) {
            this.brand = brand;
            this.model = model;
            this.ram = ram;
            //this.display();
            //Even if we will just use display(), it will work but this.display() is better practice
        }

        public void display() {
            System.out.println("Brand : " + brand); //Using this.brand is better practice
            System.out.println("Model : " + model); //Using this.model is better practice
            System.out.println("RAM : " + ram + " GB"); //Using this.ram is better practice
            System.out.println("---------------------------");
        }

        public void display1() {
            this.brand(); //Using this.brand is better practice
            this.model();//Using this.model is better practice
            this.ram();//Using this.ram is better practice
            System.out.println("+++++++++++++++++++++++++++");
        }

        public void brand() {
            System.out.println("Brand (this): " + this.brand);
            //Using this.brand is better practice
        }

        public void model() {
            System.out.println("Model (this): " + this.model);
            //Using this.model is better practice
        }

        public void ram() {
            System.out.println("RAM (this): " + this.ram);
            //Using this.ram is better practice
        }

    }

    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", "Galaxy", 12);
        p1.display1();
        Phone p2 = new Phone("Samsung", "Galaxy Grand Prime", 8);
        p2.display1();
    }
}
