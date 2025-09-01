package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

// Example demonstrating Method Overriding with specific subclass behavior
class RBI {
    public void provideLoan() {
        System.out.println("Bank should provide loan");
    }
}

class ICICI extends RBI {
    @Override
    public void provideLoan() {
        System.out.println("Provide loan @ 13% ROI"); // Overridden method
    }
}

class SBI extends RBI {
    @Override
    public void provideLoan() {
        System.out.println("Provide loan @ 12.78 % ROI"); // Overridden method
    }
}

/**
 * Advantage of Method Overriding:
 * --------------------------------
 * The advantage of Method Overriding is that each subclass specifies
 * its own specific behavior while still maintaining the same method signature.
 *
 * Example:
 * - RBI provides a generic loan message.
 * - ICICI specifies loan @ 13% ROI.
 * - SBI specifies loan @ 12.78% ROI.
 */

public class OverRidingDemo2 {
    public static void main(String[] args) {

    }
}
