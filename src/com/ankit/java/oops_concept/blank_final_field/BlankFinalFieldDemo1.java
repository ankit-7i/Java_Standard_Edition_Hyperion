package com.ankit.java.oops_concept.blank_final_field;

// Example 1: Blank Final Field without initialization (will cause compilation error)

class LIC {
    public boolean installment2;
    //final double installment; // Blank final field
}

public class BlankFinalFieldDemo1 {
    public static void main(String[] args) {
        LIC l = new LIC(); // Compilation error: variable installment might not have been initialized
        //System.out.println(l.installment);
    }
}

