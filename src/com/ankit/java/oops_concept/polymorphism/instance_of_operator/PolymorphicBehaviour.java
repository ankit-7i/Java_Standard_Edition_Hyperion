package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

class Payment {
    public void makePayment() {
        System.out.println("Generic Payment");
    }
}

class UPI extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through UPI");
    }
}

class CreditCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through Credit Card");
    }

    public void offer() {
        System.out.println("Make a payment through CreditCard and get 2 Days holidays in GOA");
    }
}

class DebitCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Making a Payment through Debit Card");
    }
}

public class PolymorphicBehaviour {
    public static void main(String[] args) {
        processPayment(new CreditCard());
    }

    public static void processPayment(Payment payment) { // Loose Coupling
        CreditCard card = (CreditCard) payment; // Downcasting
        card.makePayment();
        card.offer();
    }
}

