package com.ankit.java.oops_concept.interface_concept.Payment_small_project;

final class UPIPayment implements Payment {
    private final String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void makePayment(double amount) {
        System.out.printf("Paid RS %.1f using UPI ID : %s%n", amount, upiId);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.printf("Refunded RS %.1f to UPI ID : %s%n", amount, upiId);
    }
}
