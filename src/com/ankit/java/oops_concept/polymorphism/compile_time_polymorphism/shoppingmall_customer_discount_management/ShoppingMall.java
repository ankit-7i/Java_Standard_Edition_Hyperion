package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.shoppingmall_customer_discount_management;


import java.util.Scanner;

public class ShoppingMall {

    public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the Customer Type to get additional Discount :");
        System.out.println("1) General Customer ");
        System.out.println("2) Prime Customer ");
        System.out.println("3) VIP Customer ");

        int choice = sc.nextInt();

        System.out.println("Enter the name of the customer:");
        String name = sc.next();

        System.out.println("Enter how many items you need:");
        int item = sc.nextInt();

        String[] productNames = new String[item]; // if you want product details later
        double[] priceArr = new double[item];

        for (int i = 0; i < item; i++) {
            System.out.println("Enter the name of the product:");
            productNames[i] = sc.next();

            System.out.println("Enter the price of the product:");
            priceArr[i] = sc.nextDouble();
        }

        Customer customer = null;

        switch (choice) {
            case 1:
                customer = new GeneralCustomer(name);
                break;
            case 2:
                customer = new PrimeCustomer(name);
                break;
            case 3:
                customer = new VIP_Customer(name);
                break;
            default:
                System.err.println("Invalid choice! Exiting...");
                System.exit(0);
        }

        generateBill(customer, priceArr);

        sc.close();
    }
}
