package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

/**
 * instanceof Operator :
 * ----------------------
 * - It is a relational operator which returns a boolean value i.e. true OR false.
 * - It is also a keyword used to verify whether a reference variable is pointing
 *   to a particular type of object or not.
 * - Between the reference variable and class/interface type we must have an IS-A relation,
 *   otherwise we will get a compilation error.
 * - It is mainly used to deal with java.lang.ClassCastException.
 *
 * Example Program:
 */


// Simple Test class
class Test {
}

/**
 * Demonstrates the usage of the instanceof operator.
 */
public class InstanceOfDemo1 {

    public static void main(String[] args) {

        // Creating an object of Test class
        Test t1 = new Test();

        // Using instanceof to check if t1 is pointing to Test object
        if (t1 instanceof Test) {
            System.out.println("t1 is pointing to Test object");
        }
    }
}

