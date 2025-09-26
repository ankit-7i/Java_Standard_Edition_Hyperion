package com.ankit.java.reflection_api;

/**
 * Demonstrates creating objects at runtime using Reflection API in Java.
 * Instead of using the 'new' keyword (which requires knowing the class name at compile time),
 * we use Class.forName() and newInstance() to load and instantiate classes dynamically.
 *
 * Note:
 * - Class.forName(String className) loads the class into JVM memory.
 * - newInstance() creates an object using the default no-arg constructor.
 * - Suitable for situations where the class name is known only at runtime.
 */

// Example classes used for object creation at runtime
class Customer {
    // Empty class
}

class Player {
    // Empty class
}

class Student {
    /**
     * Default constructor for Student.
     * Prints a message when an object is created.
     */
    public Student() {
        System.out.println("Thanks newInstance() method!");
    }

    /**
     * Greet method specific to Student.
     */
    public void greet() {
        System.out.println("Hello Batch 47 & 49!");
    }
}

class Employee {
    /**
     * Greet method specific to Employee.
     */
    public void greet() {
        System.out.println("Hello Future Developer!");
    }
}

/**
 * Main class to demonstrate dynamic object creation.
 */
public class CreateObjectAtRuntime {

    /**
     * Main method to run the program.
     *
     * @param args Command line arguments where args[0] is expected to be
     *             the fully qualified class name (e.g., "Student" or "Employee").
     * @throws Exception If the class is not found or object creation fails.
     */
    public static void main(String[] args) throws Exception {

        // Load the class name passed as argument dynamically
        Object obj = Class.forName(args[0]).newInstance();

        // Print confirmation of created object
        System.out.println("Object created for -> " + obj.getClass().getName());

        // Check if the created object is of type Student
        if (obj instanceof Student) {
            Student st = (Student) obj;
            st.greet();  // Call Student greet method
        }

        // Check if the created object is of type Employee
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            emp.greet(); // Call Employee greet method
        }
    }
}
