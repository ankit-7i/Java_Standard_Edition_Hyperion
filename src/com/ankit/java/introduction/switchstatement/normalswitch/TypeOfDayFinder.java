package com.ankit.java.introduction.switchstatement.normalswitch;
import java.util.Scanner;
public class TypeOfDayFinder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String day = sc.next().toUpperCase();
            switch(day) {
                case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println(day+" is a Weekday");

                case "SATURDAY","SUNDAY" -> System.out.println(day+" is a Weekend");

                default -> System.out.println(day+" is a not a valid Day");


            }
        }



}
