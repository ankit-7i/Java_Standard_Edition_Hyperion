package com.ankit.java.oops_concept.instance_initializer;



class Demo {

    // Non-static block
    {
        System.out.println("Non Static Block");
    }

    // Constructor
    public Demo() {
        System.out.println("No Argument constructor");
    }
}

public class NonStaticBlockDemo2 {
    public static void main(String[] args) {
        new Demo();  // Creating an object of Demo class
    }
}

