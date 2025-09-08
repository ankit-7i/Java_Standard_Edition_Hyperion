package com.ankit.java.oops_concept.abstraction;

/**
 * IQ:
 * -----
 * What is the advantage of writing instance variable (Object properties),
 * constructor and non-static block inside an abstract class,
 * if we can't create an object for abstract class?
 *
 * Answer:
 * Even though we cannot create an object of an abstract class directly,
 * still we can write instance variables, constructors, and non-static blocks.
 *
 * Why? Because:
 * - Abstract classes can contain object properties and behavior.
 * - These will be initialized through subclass objects using super().
 * - So we can write object properties, non-static blocks, and constructors
 *   inside an abstract class for code reusability.
 *
 * Conclusion:
 * Abstract class helps in defining common state (variables) and behavior
 * (constructors, concrete methods), while also enforcing abstract methods
 * that subclasses must implement.
 *
 * Note: An abstract class may OR may not contain abstract methods.
 */

abstract class Hello {
    abstract void m1();   // abstract method
}

abstract class Demo {
    public void m2() {    // concrete method
        // method body can be empty or have logic
    }
    abstract void m3();   // abstract method
}

public class AbstractDemo4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}

