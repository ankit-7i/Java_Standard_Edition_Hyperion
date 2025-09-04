package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

class Payment1 {
    public void makePayment() {
        System.out.println("Generic Payment");
    }
}

class UPI1 extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through UPI!");
    }

    public void offer() {
        System.out.println("Make a payment through UPI and get 1000 RS Cash Back");
    }
}

class CreditCard1 extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through Credit Card");
    }

    public void offer() {
        System.out.println("Make a payment through CreditCard and get 2 Days holidays in Goa");
    }
}

class DebitCard1 extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through Debit Card");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        processPayment(new CreditCard());
        processPayment(new UPI());
        processPayment(new DebitCard());
    }

    public static void processPayment(Payment payment) { // Loose Coupling
        payment.makePayment();

        if (payment instanceof CreditCard) {
            CreditCard card = (CreditCard) payment;
            card.offer();
        }

        if (payment instanceof UPI) {
            UPI1 upi = (UPI1) payment;
            upi.offer();
        }

        // DebitCard doesn't have an offer method
        System.out.println("----------------------");
    }
}
