package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation;

/**
 * Demonstrates Aggregation in Java (HAS-A Relationship).
 */


public class AggregationDemo {
    public static void main(String[] args) {
        College vit = new College("VIT", "Vellore");
        College nit = new College("NIT", "Warangal");

        Student s1 = new Student(101, "Scott", vit);
        System.out.println(s1);

        Student s2 = new Student(102, "Smith", nit);
        System.out.println(s2);
    }
}
