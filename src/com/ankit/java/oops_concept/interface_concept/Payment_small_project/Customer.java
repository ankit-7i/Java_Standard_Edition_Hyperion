package com.ankit.java.oops_concept.interface_concept.Payment_small_project;
import  java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your total bill Amount : ");
        double totalAmount = scanner.nextDouble();

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        int paymentChoice = scanner.nextInt();

        Payment payment = null;
        ShoppingCart cart = new ShoppingCart(totalAmount);


        switch (paymentChoice) {
            case 1->{
                System.out.print("Enter Credit Card Holder Name: ");
                scanner.nextLine();
                String cardHolderName = scanner.nextLine();
                payment = new CreditCardPayment(cardHolderName);
                }
            case 2-> {
                System.out.print("Enter Debit Card Bank Name: ");
                scanner.nextLine();

                String bankName = scanner.nextLine();
                payment = new DebitCardPayment(bankName);
            }
            case 3 -> {
                System.out.print("Enter UPI ID: ");
                scanner.nextLine();

                String upiId = scanner.nextLine();
                payment = new UPIPayment(upiId);
            }
            default-> {
                System.out.println("Invalid choice!");
                scanner.close();
                return;
            }
        }

        cart.checkout(payment);
        System.out.println("Choose an option:");
        System.out.println("1. Cancel Order");
        System.out.println("2. Save Order");
        int orderChoice = scanner.nextInt();

        switch (orderChoice) {
            case 1 ->
                    {
                        cart.cancelOrder(payment);
                    }

            case 2 -> {
                cart.saveOrder();
            }
            default ->{
                System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
