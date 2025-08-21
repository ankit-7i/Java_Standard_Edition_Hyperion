package com.ankit.java.oops_concept.static_initializer;

/*
 * Note:
 * Program on static block which shows that:
 * - Static block and static field both have the same priority during class loading.
 * - Both are executed at the time of class loading, before object creation.
 *
 * Execution flow:
 * 1. Class is loaded → static fields + static blocks execute.
 * 2. Non-static block executes when an object is created.
 * 3. Constructor executes after non-static block.
 *
 * Example order:
 * - Static field initialization (Test t1 = new Test())
 * - Static block execution
 * - Non-static block execution (on object creation)
 * - Constructor execution
 */

class Test14 {
    public static final Test t1 = new Test(); // Static field (object created during class loading)
    // Initially t1 = null, then assigned.

    // Static block
    static {
        System.out.println("static block");
    }

    // Non-static block
    {
        System.out.println("Non static block");
    }

    // Constructor
    Test14() {
        System.out.println("No Argument Constructor");
    }
}

public class Demo8 {
    public static void main(String[] args) {
        new Test14(); // 2 steps: class loading (static field + block) + object creation
    }
}

