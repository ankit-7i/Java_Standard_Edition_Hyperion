package com.ankit.java.oops_concept.compiler_constant;

/*
 * Example: Compile-time constant inlining across multiple classes
 * ---------------------------------------------------------------
 * - A compile-time constant (static final with constant expression) is inlined
 *   into all referencing classes at compile time.
 * - So, if you change the constant value in the defining class and recompile only that class,
 *   other classes (not recompiled) will still use the old value, since they already stored
 *   the constant at compile time.
 */

//// File: Demo.java
class Demo {
    public static final int MIN_VALUE = 666;  // compile-time constant
}

//// File: Test.java
class Test {
    public static void main(String[] args) {
        System.out.println(Demo.MIN_VALUE);
    }
}

/*
 * Note:
 * - Step 1: Compile and run both Demo.java and Test.java → Output = 666
 * - Step 2: Change MIN_VALUE in Demo.java from 666 → 1500, then recompile only Demo.java
 *   (do NOT recompile Test.java).
 * - Step 3: Run Test.class again → Output will still be 666 (not 1500).
 *
 * Reason:
 * - Test.class had already inlined the value 666 at compile time.
 * - Without recompilation, Test.class does not know about the updated value in Demo.class.
 *
 * Conclusion:
 * - Compile-time constants are replaced at compile time, not resolved at runtime.
 */
