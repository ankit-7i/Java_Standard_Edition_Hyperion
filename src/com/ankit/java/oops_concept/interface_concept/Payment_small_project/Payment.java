package com.ankit.java.oops_concept.interface_concept.Payment_small_project;

sealed interface Payment permits CreditCardPayment, DebitCardPayment, UPIPayment {
    void makePayment(double amount);
    void makeRefund(double amount);
}

