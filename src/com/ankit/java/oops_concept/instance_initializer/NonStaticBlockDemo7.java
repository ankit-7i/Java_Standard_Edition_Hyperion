package com.ankit.java.oops_concept.instance_initializer;

/**
 * Demonstrates that if a non-static block is written inside
 * a constructor body manually (i.e., inside `{}`), it is
 * simply treated as a regular block of code — NOT as a
 * non-static initializer block.
 *
 * In this case, "Non Static block" is part of the constructor body,
 * and not a true non-static block.
 */


class NIT {

    public NIT() {
        System.out.println("No Argument Constructor");

        // This block is part of the constructor body
        {
            System.out.println("Non Static block");
        }
    }
}

public class NonStaticBlockDemo7 {
    public static void main(String[] args) {
        new NIT();  // Output both constructor messages
    }
}

