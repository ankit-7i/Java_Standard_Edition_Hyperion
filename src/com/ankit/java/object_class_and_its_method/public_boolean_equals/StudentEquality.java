package com.ankit.java.object_class_and_its_method.public_boolean_equals;

public class StudentEquality {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Ankit");
        Student s2  = new Student(101,"Ankit");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() +" : "+s2.hashCode());
    }
}
