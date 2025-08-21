package com.ankit.java.oops_concept.compiler_constant;

/*
 * What is a Compile Time Constant?
 * --------------------------------
 * - A compile time constant is a constant that is evaluated and replaced with its value
 *   at compile time rather than runtime.
 *
 * Rules:
 * - Must be declared with both `static` and `final`.
 * - Must be initialized with a constant expression (not via method call).
 * - Cannot be initialized inside a method or constructor.
 *
 * Behavior:
 * - At compile time, the constant value is directly substituted by the compiler.
 * - So at runtime, JVM only sees the value, not the class name.
 * - Because of this, referencing a compile time constant does not trigger class loading.
 *
 * Example:
 *   public static final int A = 100;   // Valid → no class loading
 *   public static final int A = m1();  // Invalid → requires runtime execution
 *
 * Key Point:
 * - Since the value is inlined at compile time, the class containing the constant
 *   may not even be loaded by JVM.
 */

class Sample {
    // Compile time constant
    public static final int MAX_VALUE = 500;

    static {
        System.out.println("Sample class Static Block");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        // Even though we access Sample.MAX_VALUE, Sample class is not loaded,
        // because compiler already replaced Sample.MAX_VALUE with 500.
        System.out.println(Sample.MAX_VALUE);
    }
}

/*
 * Note:
 * - Sample.class file will NOT be loaded because MAX_VALUE is a compile time constant.
 * - Output will simply be: 500
 */

