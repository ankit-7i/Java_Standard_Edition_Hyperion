package com.ankit.java.oops_concept.interface_concept.Payment_small_project;

final class CreditCardPayment implements Payment {
    private final String cardHolderName;

    public CreditCardPayment(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void makePayment(double amount) {
        System.out.printf("Paid RS :%.1f using Credit Card Holder : %s%n", amount, cardHolderName);
    }

    @Override
    public void makeRefund(double amount) {
        System.out.printf("Refunded RS :%.1f to Credit Card Holder : %s%n", amount, cardHolderName);
    }
}