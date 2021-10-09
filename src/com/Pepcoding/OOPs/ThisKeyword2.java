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
            System.out.println("Address in Constructor : " + this);
            //This address is the address in HEAP MEMORY where this Object has been stored
        }

        public void display() {
            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
            System.out.println("RAM : " + ram + " GB");
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", "Galaxy", 12);
        System.out.println("Address in Main Method : " + p1);
        //This address is the address in HEAP MEMORY where this Object has been stored
        p1.display();

        Phone p2 = new Phone("Samsung", "Galaxy Grand Prime", 8);
        System.out.println("Address in Main Method : " + p2);
        p2.display();
    }
}
