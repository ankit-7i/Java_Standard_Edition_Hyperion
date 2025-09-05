package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.shoppingmall_customer_discount_management;

public class VIP_Customer extends Customer
{
    protected double discountRate = 20.0;

    public VIP_Customer(String name) {
        super(name);
        this.discountRate = 15.0;
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

        double discountAmount = total * 0.20;
        double finalAmount = total - discountAmount;

        System.out.println("\uD83D\uDED2 Welcome to AAA Mall  \uD83D\uDED2");
        System.out.println("VIP Customer Alert ");
        System.out.println("🧾 Customer Name : " + name);
        System.out.println("💰 Total Cost    : " + total);
        System.out.println(" \uD83C\uDFF7 Discount Amount :"+discountAmount);
        System.out.println("💰 Final Cost    : " + finalAmount);
        System.out.println("Thank You  \uD83D\uDE4F Visit Again");



    }



}

