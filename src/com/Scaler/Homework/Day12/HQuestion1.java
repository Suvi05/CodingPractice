package com.Scaler.Homework.Day12;

import java.util.HashMap;
import java.util.Scanner;

public class HQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date : ");
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        //Months
        HashMap<String, String> month = new HashMap<>();
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "07");
        month.put("Aug", "08");
        month.put("Sep", "09");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");
        //Days
        HashMap<String, String> day = new HashMap<>();
        day.put("1st", "01");
        day.put("2nd", "02");
        day.put("3rd", "03");
        day.put("4th", "04");
        day.put("5th", "05");
        day.put("6th", "06");
        day.put("7th", "07");
        day.put("8th", "08");
        day.put("9th", "09");
        day.put("10th", "10");
        day.put("11th", "11");
        day.put("12th", "12");
        day.put("13th", "13");
        day.put("14th", "14");
        day.put("15th", "15");
        day.put("16th", "16");
        day.put("17th", "17");
        day.put("18th", "18");
        day.put("19th", "19");
        day.put("20th", "20");
        day.put("21st", "21");
        day.put("22nd", "22");
        day.put("23rd", "23");
        day.put("24th", "24");
        day.put("25th", "25");
        day.put("26th", "26");
        day.put("27th", "27");
        day.put("28th", "28");
        day.put("29th", "29");
        day.put("30th", "30");
        day.put("31st", "31");

        String date = "";
        String[] res = A.split(" ");

        date = res[2] + "-" + month.get(res[1]) + "-" + day.get(res[0]);

        return date;
    }
}
//1st Mar 1984