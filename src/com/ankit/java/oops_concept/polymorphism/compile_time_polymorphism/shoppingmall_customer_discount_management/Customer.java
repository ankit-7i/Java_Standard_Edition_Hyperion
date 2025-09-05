package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.shoppingmall_customer_discount_management;

public class Customer {
    protected String name;

    public Customer(String name) {
        super();
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Error: Name cannot be empty!");
            System.exit(0);
        }
        this.name = name;
    }


    public void calculateBill(double ...prices) {

        double total = 0.0;

        for (double price : prices) {
            if (price < 0) {
                System.err.println(" Error: Item price cannot be negative. Exiting...");
                return;
            }
            total += price;
        }



        System.out.println("🧾 Customer Name : " + name);
        System.out.println("💰 Total Cost    : " + total);



    }


}
