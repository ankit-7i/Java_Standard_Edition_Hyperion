package com.ankit.java.record_concept_jdk_17;

// Define a record to represent a Person
record Person(String name, int age) {
    // You can still add methods if needed
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}

public class RecordExample {
    public static void main(String[] args) {
        // Create record objects
        Person p1 = new Person("Ankit", 25);
        Person p2 = new Person("Ankit", 25);
        Person p3 = new Person("Cosmic", 30);

        // Access fields using auto-generated accessors
        System.out.println(p1.name());  // prints: Ankit
        System.out.println(p1.age());   // prints: 25

        // Auto-generated toString()
        System.out.println(p1); // prints: Person[name=Ankit, age=25]

        // Auto-generated equals() and hashCode()
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false

        // Custom method inside record
        System.out.println(p1.greet());
    }
}

