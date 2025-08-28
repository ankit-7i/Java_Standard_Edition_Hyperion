package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.payment_project;

import java.util.Scanner;

public class ElcPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Payment Menu");
        System.out.println(" Please select any one Payment Method from the Menu : ");
        System.out.println("1) Payment by using Cash");
        System.out.println("2) Payment by using Debit Card");
        System.out.println("3) Payment by using Credit Card");
        System.out.print("Please enter your Payment choice [1/2/3] : ");
        int choice = Integer.parseInt(sc.nextLine());

        Payment payment = new Payment();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the amount you want to pay through cash : ");
                double amount = Double.parseDouble(sc.nextLine());
                payment.makePayment(amount); // ✅ call cash payment method
            }
            case 2 -> {
                System.out.print("Enter your 16 digit Debit Card Number : ");
                String cardNumber = sc.nextLine();
                System.out.print("Enter your Payment Amount : ");
                double amount = Double.parseDouble(sc.nextLine());
                payment.makePayment(cardNumber, amount);
            }
            case 3 -> {
                System.out.print("Enter your name : ");
                String cardHolderName = sc.nextLine();
                System.out.print("Enter your 16 digit Credit Card Number : ");
                String cardNumber = sc.nextLine();
                System.out.print("Enter your Payment Amount : ");
                double amount = Double.parseDouble(sc.nextLine());
                payment.makePayment(cardHolderName, cardNumber, amount);
            }
            default -> System.out.println("Invalid Choice! Please try again.");
        }
    }
}

