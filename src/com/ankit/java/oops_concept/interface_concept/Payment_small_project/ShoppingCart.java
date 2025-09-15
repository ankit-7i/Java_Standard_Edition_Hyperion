package com.ankit.java.oops_concept.interface_concept.Payment_small_project;

public class ShoppingCart {
    private final double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void checkout(Payment payment) {
        System.out.printf("Starting checkout for amount RS :%.1f%n", totalAmount);
        payment.makePayment(totalAmount);
    }

    public void cancelOrder(Payment payment) {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.printf("Cancelling order for amount RS :%.1f%n", totalAmount);
        payment.makeRefund(totalAmount);
    }

    public void saveOrder() {
        System.out.println("Order saved successfully!");
    }
}
