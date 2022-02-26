package com.JavaTraining.Constructor;

public class BankCustomerM {
    String name;
    int adhar;

    BankCustomerM(){

    }

    public static void main(String[] args) {
        BankCustomerM c1=new BankCustomerM();
        c1.name="Aditya";
        c1.adhar=1234;

        BankCustomerM c2=new BankCustomerM();
        c2.name="Sid";
        c2.adhar=2345;
    }
}
