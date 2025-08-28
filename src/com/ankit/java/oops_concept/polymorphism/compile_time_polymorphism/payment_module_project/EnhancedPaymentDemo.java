package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.payment_module_project;

import java.util.Scanner;

public class EnhancedPaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnhancedPaymentSystem payment = new EnhancedPaymentSystem();

        System.out.println("Welcome to Enhanced Payment System");
        System.out.println("==================================");
        System.out.println("Select a payment method:");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");
        System.out.println("4. Partial (Cash + UPI)");
        System.out.println("5. Gift Card");
        System.out.println("6. EMI");
        System.out.println("7. Net Banking");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Cash Amount: ");
                double amt = sc.nextDouble();
                payment.makePayment(amt);
            }
            case 2 -> {
                System.out.print("Enter UPI ID: ");
                String upi = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                payment.makePayment(upi, amt);
            }
            case 3 -> {
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();
                System.out.print("Enter Expiry (MM/YY): ");
                String exp = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                payment.makePayment(card, cvv, exp, amt);
            }
            case 4 -> {
                System.out.print("Enter Total Amount: ");
                double total = sc.nextDouble();
                System.out.print("Enter Cash Paid: ");
                double cash = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter UPI ID: ");
                String upi = sc.nextLine();
                payment.makePayment(cash, total, upi);
            }
            case 5 -> {
                System.out.print("Enter Gift Card Code: ");
                String code = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                payment.makePayment(code, amt, true);
            }
            case 6 -> {
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();
                System.out.print("Enter EMI Amount: ");
                double emi = sc.nextDouble();
                System.out.print("Enter Months: ");
                int months = sc.nextInt();
                payment.makePayment(card, emi, months);
            }
            case 7 -> {
                System.out.print("Enter Bank Name: ");
                String bank = sc.nextLine();
                System.out.print("Enter Account Number: ");
                String acc = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                payment.makePayment(bank, acc, amt, 0);
            }
            default -> System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
