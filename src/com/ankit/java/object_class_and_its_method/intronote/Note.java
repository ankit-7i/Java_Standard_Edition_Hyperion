package com.ankit.java.object_class_and_its_method.intronote;

public class Note {
    /**
     * Object class and It's Method :
     *
     * java.lang.Object is a predefined class and by default It is the super class of all the classes we have in java.
     *
     * It plays a major role in Object creation, Whenever we create any object the control must reach to Object class first.
     *
     * Object is the first class to be loaded into JVM memory.
     *
     * Object class privides 11 non static methods.
     *
     * All the classes either predefined OR user-defined are the sub classes of Object class so we can override the non final methods of Object class in any class in java.
     *
     * Example :
     *
     * Test.java
     *
     * public class Test
     * {
     * }
     *
     *
     * Test.class
     *
     * public class Test extends Object   // Test is the sub class & Object is the super class
     * {
     *     // Here we can override non final methods of Object class
     * }
     *
     *
     * Object class methods, We will learn in different phases. In this particular phase we will learn total 4 methods :
     *
     * a) public native final java.lang.Class getClass()
     * b) public native int hashCode()
     * c) public String toString()
     * d) public boolean equals(Object obj)
     *
     */
}
