package com.ankit.java.object_class_and_its_method.public_boolean_equals;

/**
 * public boolean equals(Object obj) :
 * -----------------------------------
 * → It is a predefined non-static method of the Object class which is used to
 *   compare two objects based on the memory reference OR memory address because
 *   internally it uses == operator only.
 *
 * → Object class equals(Object obj) method and == operator both are having
 *   the same behavior.
 *
 * Example:
 * In the below code, even though the data inside both Employee objects is the same,
 * the comparison using == and equals() will return false because they point
 * to different memory locations.
 */


class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

public class EqualsDemo1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "Raj");
        Employee e2 = new Employee(111, "Raj");

        System.out.println(e1 == e2);          // false → compares references
        System.out.println(e1.equals(e2));     // false → also compares references
    }
}

