package com.ankit.java.oops_concept.anonymous_inner_class;

/**
 * Example: Anonymous Inner Class with Abstract Class
 *
 * - Abstract class Loan defines an abstract method applyLoan().
 * - We cannot create objects of an abstract class directly.
 * - Using an anonymous inner class, we provide the implementation
 *   of the abstract method at the time of object creation.
 *
 * - This allows us to create different "Loan" types (CarLoan, BikeLoan)
 *   without explicitly creating separate subclasses.
 */

abstract class Loan
{
    /** Abstract method that must be implemented by subclasses */
    public abstract void applyLoan();
}

/**
 * Driver class demonstrating anonymous inner classes with Loan.
 */
public class AnonymousInnerClassDemo2
{
    public static void main(String[] args)
    {
        // Anonymous inner class for Car Loan
        Loan carLoan = new Loan() {
            @Override
            public void applyLoan() {
                System.out.println("Apply for Car loan");
            }
        };

        // Anonymous inner class for Bike Loan
        Loan bikeLoan = new Loan() {
            @Override
            public void applyLoan() {
                System.out.println("Apply for Bike loan");
            }
        };

        // Method calls
        carLoan.applyLoan();   // Output: Apply for Car loan
        bikeLoan.applyLoan();  // Output: Apply for Bike loan
    }
}

