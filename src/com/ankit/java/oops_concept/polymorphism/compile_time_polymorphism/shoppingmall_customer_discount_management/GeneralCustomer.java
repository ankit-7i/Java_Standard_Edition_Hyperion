package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.shoppingmall_customer_discount_management;

public class GeneralCustomer extends Customer {

    public GeneralCustomer(String name) {
        super(name);
    }

    @Override
    public void calculateBill(double ... prices) {
        double total = 0.0;
        for(double price:prices) {
            if (price < 0) {
                System.err.println(" Error: Item price cannot be negative. Exiting...");
                return;
            }
            total += price;
        }

        double discount =0.0;

        double finalAmount = total-discount;

        System.out.println("\uD83D\uDED2  Welcome to AAA Mall   \uD83D\uDED2");
        System.out.println("🧾 Customer Name : " + name);
        System.out.println("💰 Total Cost    : " + total);
        System.out.println(" \uD83C\uDFF7Sorry Customer General customer are not eligible for discount..");
        System.out.println("Thank You  \uD83D\uDE4F Visit Again");
    }
}

