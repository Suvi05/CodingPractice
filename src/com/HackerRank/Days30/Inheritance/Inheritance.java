package com.HackerRank.Days30.Inheritance;


import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate() {
        int marks = 0;
        int total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total = total + testScores[i];
        }
        marks = total/testScores.length;

        if (marks <= 100 && marks >= 90) {
            return 'O';
        } else if (marks >= 80 && marks < 90) {
            return 'E';
        } else if (marks >= 70 && marks < 80) {
            return 'A';
        } else if (marks >= 55 && marks < 70) {
            return 'P';
        } else if (marks >= 40 && marks < 55) {
            return 'D';
        } else return 'T';
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}