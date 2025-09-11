package com.ankit.java.object_class_and_its_method.public_boolean_equals;


class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.id; // hashCode based only on id
    }

    // Overriding equals for content comparison
    @Override
    public boolean equals(Object obj) {
        Product p2 = (Product) obj;

        if (this.id == p2.id && this.name.equals(p2.name)) {
            return true;
        } else {
            return false;
        }
    }
}

public class EqualsDemo2 {
    public static void main(String[] args) {
        Product p1 = new Product(111, "Camera");
        Product p2 = new Product(111, "Camera");

        System.out.println(p1.equals(p2));
        // true → content same

        System.out.println(p1.hashCode() + " : " + p2.hashCode());
        // same hash code since id is same (111)
    }
}

