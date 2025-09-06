package com.ankit.java.oops_concept.sealed_keyword;

// Sealed class: Only UPI, CreditCard, DebitCard are allowed to extend Payment
sealed class Payment permits UPI, CreditCard, DebitCard {
    public double makePayment(double amount) {
        return 0.0;
    }
}

// 'final' means UPI cannot be extended further
final class UPI extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount; // returns payment amount
    }
}

// 'non-sealed' means CreditCard can still be extended by other classes
non-sealed class CreditCard extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount;
    }
}

// 'non-sealed' means DebitCard can also be extended further
non-sealed class DebitCard extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount;
    }
}

public class SealedDemo2 {
    public static void main(String[] args) {
        Payment p = null;

        // Using UPI payment
        p = new UPI();
        double payment = p.makePayment(12000);
        System.out.println("Making a payment of: " + payment + " via UPI");

        // Using CreditCard payment
        p = new CreditCard();
        payment = p.makePayment(29000);
        System.out.println("Making a payment of: " + payment + " via CreditCard");

        // Using DebitCard payment
        p = new DebitCard();
        payment = p.makePayment(15000);
        System.out.println("Making a payment of: " + payment + " via DebitCard");
    }
}

/*
 * Explanation of Sealed Classes in this Example:
 * ----------------------------------------------
 * - Payment is sealed -> only UPI, CreditCard, and DebitCard can extend it.
 * - UPI is 'final'     -> no further extension is allowed.
 * - CreditCard is 'non-sealed' -> other classes can extend it later (e.g., VisaCard, MasterCard).
 * - DebitCard is 'non-sealed'  -> can also be extended further.
 *
 * This enforces controlled hierarchy while still allowing flexibility.
 *
 * ✅ Output:
 * Making a payment of: 12000.0 via UPI
 * Making a payment of: 29000.0 via CreditCard
 * Making a payment of: 15000.0 via DebitCard
 *
 * Benefits:
 * ---------
 * - Provides strong control over inheritance.
 * - Makes class hierarchy explicit and safe.
 * - Useful in modeling domains (like payments) where valid child classes are limited.
 */

