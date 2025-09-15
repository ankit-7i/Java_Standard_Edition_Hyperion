package com.ankit.java.oops_concept.interface_concept.Payment_small_project;

final class DebitCardPayment implements Payment {
    private final String bankName;

    public DebitCardPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void makePayment(double amount) {
        System.out.printf("Paid RS :%.1f using Debit Card Bank: %s%n", amount, bankName);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.printf("Refunded RS :%.1f to Debit Card Bank: %s%n", amount, bankName);
    }
}
