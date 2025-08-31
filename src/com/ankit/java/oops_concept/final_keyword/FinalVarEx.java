package com.ankit.java.oops_concept.final_keyword;

// Example 1: Final primitive variable
/**
 * final Variable / Field
 *
 * Once assigned, the variable cannot be reassigned.
 *
 * Works like a constant (like const in C/C++).
 *
 * Convention: Use uppercase letters for final variables.
 */

class A2 {
    final int A = 10;

    public void setData() {
        // A = 20; // ❌ Error: Cannot reassign final variable
        System.out.println("A value is: " + A);
    }
}

class FinalVarEx {
    public static void main(String[] args) {
        A2 a1 = new A2();
        a1.setData();
    }
}

