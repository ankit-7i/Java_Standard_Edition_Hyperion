package com.ankit.java.oops_concept.blank_final_field;

// Example: Blank final field must be initialized by the developer explicitly
// until object creation (constructor body execution).
// Can be initialized in:
// a) Instance initializer block
// b) Constructor body

class LIC3 {
    final double installment2; // Blank final field

    // Instance initializer block (allowed for initializing blank final field)
    {
        installment2 = 20000;
    }

    // Constructor initialization (also allowed, but must ensure only one assignment)
    public LIC3() {
        // installment = 25000; // Uncommenting this will cause a compilation error because it's already initialized above
    }
}

public class BlankFinalFieldDemo3 {
    public static void main(String[] args) {
        LIC l = new LIC();
        System.out.println(l.installment2); // Output: 20000
    }
}

