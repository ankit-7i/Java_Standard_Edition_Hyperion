package com.ankit.java.oops_concept.instance_initializer;

/**
 * If a class contains multiple non-static blocks, they are executed
 * in the order in which they appear (top to bottom) in the class.
 *
 * Non-static blocks are executed before the constructor body.
 */


class Customer {

    private double balance;

    // First non-static block
    {
        balance = 1000;
        System.out.println("Current balance is: " + this.balance);
    }

    // Second non-static block
    {
        balance = 2000;
        System.out.println("Current balance is: " + this.balance);
    }

    // Third non-static block
    {
        balance = 3000;
        System.out.println("Current balance is: " + this.balance);
    }

    // Constructor
    public Customer() {
        balance = 4000;
        System.out.println("Current balance is: " + this.balance);
    }
}

/**
 * Main class to execute the Customer object creation
 */
public class NonStaticBlockDemo6 {
    public static void main(String[] args) {
        new Customer();  // This triggers execution of non-static blocks and then the constructor
    }
}

