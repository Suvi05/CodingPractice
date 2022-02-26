package com.JavaTraining.NonStaticMembers;

public class NonStaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");   //1
        NonStaticBlock object=new NonStaticBlock();
        object.balanceEnquiry();
    }
   void balanceEnquiry(){
       System.out.println("Non Static Method 1"); //4
   }
    {
        System.out.println("Non Static Block"); //2
    }
    NonStaticBlock(){ //Constructor
        System.out.println("Inside Constructor"); //3
    }
}
