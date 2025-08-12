package com.ankit.java.oops_concept.constructor.modifiers_in_constructor;
// Student.java
class Student {
    // Private constructor prevents direct instantiation
    private Student() {
        System.out.println("private constructor of student class");
    }

    // Public method to demonstrate functionality
    public void greet() {
        System.out.println("Hello Batch 47 & 49");
    }

    // Static method to return a new instance (Singleton-like access)
    public static Student getObject() {
        return new Student();
    }
}

// Test.java
public class Test {
    public static void main(String[] args) {
        // Accessing Student instance via static method
        Student obj = Student.getObject();
        obj.greet();
    }
}