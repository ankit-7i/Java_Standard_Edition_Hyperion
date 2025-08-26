package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation.order_aggregation_example;
public class Order {
    private String orderId;
    private String itemName;
    private int quantity;
    private double price;

    public Order(String orderId, String itemName, int quantity, double price) {
        if(orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Invalid Order ID");
        }
        if(quantity <= 0 || price <= 0) {
            throw new IllegalArgumentException("❌ Quantity & Price must be greater than 0");
        }
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalAmount() {
        return quantity * price;
    }


    @Override
    public String toString() {
        return String.format("🛒 Order ID: %s\n   Item: %s\n   Quantity: %d\n   Price: ₹%.2f\n   Total: ₹%.2f",
                orderId, itemName, quantity, price, getTotalAmount());
    }
}

