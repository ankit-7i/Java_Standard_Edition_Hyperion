package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation.order_aggregation_example;

public class Customer {
    private String name;
    private String email;
    private String address;
    private long mobileNo;
    private String paymentMode;
    private Order order;

    public Customer(String name, String email, String address, long mobileNo, String paymentMode, Order order) {
        if(mobileNo <= 0) {
            throw new IllegalArgumentException("❌ Invalid Mobile Number");
        }
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobileNo = mobileNo;
        this.paymentMode = paymentMode;
        this.order = order;
    }

    @Override
    public String toString() {
        return "==============================\n" +
                "         📦 ORDER RECEIPT      \n" +
                "==============================\n" +
                "👤 Customer Details\n" +
                "   Name: " + name + "\n" +
                "   Email: " + email + "\n" +
                "   Address: " + address + "\n" +
                "   Mobile: " + mobileNo + "\n" +
                "   Payment Mode: " + paymentMode + "\n\n" +
                order.toString() + "\n" +
                "==============================\n" +
                " ✅ Thank you for ordering with Zomato+ 🍽️\n" +
                "==============================";
    }
}

