package com.ankit.java.oops_concept.final_keyword;
/**
 * inal with Objects
 *
 * Reference of object cannot be changed (reassigned).
 *
 * But fields of the object can still be modified (unless they are also final).
 */

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[Student id = " + this.id + ", Student Name = " + this.name + "]";
    }
}

class FinalVarEx1 {
    public static void main(String[] args) {
        final Student s1 = new Student(111, "Scott");
        System.out.println(s1);

        // ❌ Error: Cannot reassign s1 to new object
        // s1 = new Student(222, "Smith");

        // ✅ Allowed: Modifying existing object's fields
        // (if setters were available, we could change name/id inside the object)
    }
}

