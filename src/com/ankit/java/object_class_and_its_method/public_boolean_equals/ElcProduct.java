package com.ankit.java.object_class_and_its_method.public_boolean_equals;

public class ElcProduct {
    public static void main(String[] args) {
        Product12 p1 = new Product12(111, "FAN");
        Product12 p2 = new Product12(111, "FAN");

        // Test equality
        System.out.println(p1.equals(p2)); // true

        // Test hash codes
        System.out.println(p1.hashCode() + " : " + p2.hashCode()); // Same hash codes
    }
}
