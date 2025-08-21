package com.ankit.java.oops_concept.compiler_constant;

/*
 * Program: Difference between Compile Time Constant and Runtime Constant
 * ----------------------------------------------------------------------
 * - If a static final variable is initialized using a method call,
 *   it is NOT a compile time constant → it becomes a runtime constant.
 *
 * - In such case, JVM must load the class to execute the method and assign value.
 * - Hence, class loading occurs, and static block executes as well.
 *
 * Example:
 *   public static final int MAX_VALUE = m1();  // Runtime constant
 */

class Sample2 {
    // Runtime constant (initialized using method call, not a direct constant expression)
    public static final int MAX_VALUE = m1();

    // Static method returning a value
    public static int m1() {
        return 500;
    }

    // Static block
    static {
        System.out.println("Sample class Static Block");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Sample.MAX_VALUE);
    }
}

/*
 * Note:
 * - Here the class will be loaded because MAX_VALUE is initialized via method call.
 *
 * Expected Output:
 * ----------------
 * Sample class Static Block
 * 500
 */

