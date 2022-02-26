package com.JavaTraining.Constructor;

public class BankCustomerConstructor {
    String name;
    int DL;

    BankCustomerConstructor(String name, int DL){  //Parameterized Constructor
        this.name=name;
        this.DL=DL;
    }
    BankCustomerConstructor(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        BankCustomerConstructor c1=new BankCustomerConstructor("Aadi", 1234); //Adi -20
        BankCustomerConstructor c2=new BankCustomerConstructor("Sid"); // Sid -15
    }
}
