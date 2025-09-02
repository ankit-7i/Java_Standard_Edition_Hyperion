package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

// Demonstration of Variable Hiding vs Method Overriding in Java

class RBI {
    /**
     * Variable IFSCCode belongs to RBI class.
     * Variables are NOT overridden, they are hidden.
     * Access to variables always depends on the reference type.
     */
    protected String IFSCCode = "RBIHYD0001";

    /**
     * loan() method of RBI class
     * Can be overridden by child classes.
     */
    public String loan() {
        return "Bank should provide loan";
    }
}

class SBI extends RBI {
    /**
     * Variable IFSCCode belongs to SBI class.
     * This hides the IFSCCode of RBI, but does NOT override it.
     */
    protected String IFSCCode = "SBIAMPT00014";

    /**
     * loan() method of SBI class
     * Overrides the loan() method of RBI class.
     */
    @Override
    public String loan() {
        return "SBI Provides loan @ 9.2% ROI";
    }
}

public class OverridingDemo6 {
    /**
     * Main method
     * Demonstrates variable hiding and method overriding using upcasting.
     */
    public static void main(String[] args) {
        RBI rbi = new SBI();
        // Upcasting: Parent reference → Child object

        System.out.println(rbi.IFSCCode + " : " + rbi.loan());
        // Variable → resolved using reference type (RBI) → "RBIHYD0001"
        // Method   → resolved at runtime (dynamic dispatch) → "SBI Provides loan @ 9.2% ROI"
    }
}

/**
 * NOTE:
 * 1) There is NO variable overriding in Java (only variable hiding).
 * 2) Variables are always executed from the current reference type (compile-time).
 * 3) Methods are overridden and resolved at runtime (dynamic method dispatch).
 *
 * Output:
 * RBIHYD0001 SBI Provides loan @ 9.2% ROI
 */

