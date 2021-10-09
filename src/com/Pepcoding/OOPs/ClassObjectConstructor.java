package com.Pepcoding.OOPs;

public class ClassObjectConstructor {
    public static class Phone {
        String companyName;
        String model;
        String color;
        int ram;
        int storage;
        int batteryPower;

        public Phone(String companyName, String model, String color, int ram, int storage, int batteryPower) {
            this.companyName = companyName;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.batteryPower = batteryPower;
        }

        public Phone() {
            //Default constructor for Constructor Chaining
        }

        public String getInfo() {
            StringBuilder str = new StringBuilder();
            str.append("Company Name : " + this.companyName + "\n");
            str.append("Model : " + this.model + "\n");
            str.append("Color : " + this.color + "\n");
            str.append("RAM : " + this.ram + " GB \n");
            str.append("Storage : " + this.storage + " GB \n");
            str.append("Batter Power : " + this.batteryPower + " mAh \n");

//            System.out.println(str);
            return str.toString();
        }
    }

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Phone p1 = new Phone("One Plus", "OnePlus 8", "Jet Black", 16, 128, 4500);
        Phone p2 = new Phone("Iphone", "Iphone 12", "Black", 16, 128, 5000);
        //Printed using Parameterized Constructor

        /*p2.companyName = "Iphone";
        p2.model = "Iphone 12";
        p2.color = "Black";
        p2.ram = 16;
        p2.storage = 128;
        p2.batteryPower = 50000;*/ //This will override the Constructor

        Phone p3 = new Phone(); //Printed using Default Constructor
        p3.companyName = "Realme";
        p3.model = "Realme Pro 9";
        p3.color = "Blue";
        p3.ram = 32;
        p3.storage = 256;
        p3.batteryPower = 6500;
        p3.getInfo();


        String str = p1.getInfo();
        System.out.println(str);
        System.out.println("-------------");

        str = p2.getInfo();
        System.out.println(str);
        System.out.println("-------------");

        str = p3.getInfo();
        System.out.println(str);
        System.out.println("-------------");

    }
}
