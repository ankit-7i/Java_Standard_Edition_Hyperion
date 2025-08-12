package com.ankit.java.oops_concept.constructor.modifiers_in_constructor;

public class PrivateConstructor {
    // Private constructor
    private PrivateConstructor() {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) {
        // Creating an instance within the same class is allowed
        new PrivateConstructor();
    }
}

