package com.ankit.java.oops_concept.wrapper_class_concept.auto_unboxing_concept;

// Converting Wrapper object into primitive
public class AutoUnboxing1 {
    public static void main(String args[]) {
        Integer obj = 15;   // Upto 1.4
        int x = obj.intValue();
        System.out.println(x);
    }
}

