package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.shoppingmall_customer_discount_management;


public class PrimeCustomer extends Customer {
    protected double discountRate =10.0;

    public PrimeCustomer(String name) {
        super(name);
        this.discountRate = 10.0;
    }

    @Override
    public void calculateBill(double ...prices) {
        double total = 0.0;
        for(double price :prices) {
            if (price < 0) {
                System.err.println(" Error: Item price cannot be negative. Exiting...");
                return;
            }
            total += price;
        }

        double discountAmount = total * 0.10;
        double finalAmount = total - discountAmount;

        System.out.println("\uD83D\uDED2Welcome to AAA Mall\uD83D\uDED2");
        System.out.println("You are Our Prime Customer ");
        System.out.println("🧾 Customer Name : " + name);
        System.out.println("💰 Total Cost    : " + total);
        System.out.println(" \uD83C\uDFF7Discount Amount :"+discountAmount);
        System.out.println("💰 Final Cost    : " + finalAmount);
        System.out.println("Thank You  \uD83D\uDE4F Visit Again");


    }


}
