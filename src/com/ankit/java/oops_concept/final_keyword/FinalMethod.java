package com.ankit.java.oops_concept.final_keyword;

/*
 * Example: Final Method
 * ----------------------
 * If a method is declared final:
 *  → Overriding is not possible in a subclass.
 *
 * Use-case:
 * - When the method implementation is critical and should not be changed by child classes.
 */



class Bird {
    // Final method
    public final void fly() {
        System.out.println("Generic Bird is flying");
    }
}

class Parrot extends Bird {
    // ❌ Error: Cannot override final method
    /*
    public void fly() {
        System.out.println("Parrot Bird is flying");
    }
    */
}

public class FinalMethod {
    public static void main(String[] args) {
        Bird bird = new Parrot();
        bird.fly(); // Calls the final method from Bird
    }
}

