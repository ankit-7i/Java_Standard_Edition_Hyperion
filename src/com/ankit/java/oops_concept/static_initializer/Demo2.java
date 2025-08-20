package com.ankit.java.oops_concept.static_initializer;

/**
 * Demonstrates when static blocks are executed in Java.
 *
 * - A class in Java is not loaded automatically.
 * - It is loaded based on user request.
 * - Therefore, a static block inside a class will execute only
 *   when that class is loaded for the first time.
 */

class Student {

    /**
     * Static block inside Student class.
     * Executes only once when the Student class is loaded into JVM memory.
     */
    static {
        System.out.println("Static Block of Student");
    }

    /**
     * Constructor of Student class.
     * Executes when a new object of Student is created.
     */
    public Student() {
        System.out.println("No argument Constructor");
    }

    /**
     * Non-static block (Instance block).
     * Executes every time an object of Student is created,
     * before the constructor.
     */
    {
        System.out.println("Non Static Block");
    }
}

/**
 * Main class demonstrating static block execution order.
 */
public class Demo2 {

    /**
     * Main method - Program execution starts here.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    /**
     * Static block inside SBDemo2.
     * Executes when SBDemo2 class is loaded into JVM memory.
     */
    static {
        System.out.println("Static block of SBDemo2");
    }
}

/**
 * Note: Student.class is NOT loaded in this program
 * because no object of Student was created and no static reference was used.
 * Hence, Student's static block will not execute.
 */

