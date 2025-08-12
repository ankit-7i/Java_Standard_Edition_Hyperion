package com.ankit.java.introduction.switchstatement.normalswitch;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("\t\t**Emergency Contacts**\n");
        System.out.println("\t\t**100 :- Police**\n");
        System.out.println("\t\t**101 :- Fire Brigade**\n");
        System.out.println("\t\t**102 :- Ambulance**\n");
        System.out.println("\t\t**139 :- Railway Emergency**\n");
        System.out.println("\t\t**181 :- Women's Helpline**\n");

        Scanner sc = new Scanner(System.in);
        int choice  = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 100 -> System.out.println("Police Serivice.");
            case 101 -> System.out.println("Fire Brigade Serivice.");
            case 102 -> System.out.println("Ambulance Serivice.");
            case 139 -> System.out.println("Railway Emergency Serivice.");
            case 181 -> System.out.println("Women's Helpline Serivice.");
            default -> System.out.println("Invalid Chioce ");

        }
        System.out.println("Your service will started shortly");
        System.out.println("Be safe !!!");
        sc.close();

    }
}
