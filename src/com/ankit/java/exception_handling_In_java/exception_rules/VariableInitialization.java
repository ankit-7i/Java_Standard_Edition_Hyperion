package com.ankit.java.exception_handling_In_java.exception_rules;


/**
 * 🔍 Explanation:
 *
 * Java does not allow the use of a local variable before it's guaranteed to be initialized. When a variable is initialized only inside a try block, and you try to use it in a catch block, the compiler cannot be sure it was initialized—because the try block might be skipped due to an exception.
 */
public class VariableInitialization {
    public static void main(String[] args) {
        int x;

        try {
            x = 100;
            System.out.println(x);
        } catch (Exception e) {
            x = 200;
            System.out.println(x);
        }
    }
}

