package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.composition;

// Car.java
public class Car {
    private String name;
    private int model;
    private final Engine engine;   // HAS-A Relation (Composition)

    public Car(String name, int model) {
        super();
        this.name = name;
        this.model = model;
        this.engine = new Engine("Battery", 1200); // Engine object created
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
    }
}

