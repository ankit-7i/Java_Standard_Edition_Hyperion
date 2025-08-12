package com.ankit.java.oops_concept.instance_initializer;

class Sample {

    // Non-static block
    {
        System.out.println("Non static block");
    }

    // No-argument constructor
    public Sample() {
        this("Java");  // Calls the parameterized constructor
        System.out.println("No Argument Constructor");
    }

    // Parameterized constructor
    public Sample(String language) {
        System.out.println("Language is: " + language);
    }
}

public class NonStaticBlockDemo3 {
    public static void main(String[] args) {
        new Sample();  // Creates an object of Sample class
    }
}

