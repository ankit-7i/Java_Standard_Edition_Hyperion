package com.ankit.java.oops_concept.static_initializer;


/**
 * Demonstrates static blocks and constructors in inheritance.
 *
 * - Static blocks execute once when the class is loaded.
 * - Non-static blocks execute each time an object is created (before constructor).
 * - Constructor executes after non-static block.
 * - Inheritance respects parent-first execution order.
 */
// Interview question
class Alpha {
    /** Non-static block of Alpha */
    {
        System.out.println("A");
    }

    /** Constructor of Alpha */
    public Alpha() {
        System.out.println("B");
    }

    /** Static block of Alpha */
    static {
        System.out.println("C");
    }
}

class Beta extends Alpha {
    /** Non-static block of Beta */
    {
        System.out.println("D");
    }

    /** Constructor of Beta */
    public Beta() {
        System.out.println("E");
    }

    /** Static block of Beta */
    static {
        System.out.println("F");
    }
}

/**
 * Main class to test execution order in inheritance.
 */
public class Demo5 {
    public static void main(String[] args) {
        new Beta();
    }
}
