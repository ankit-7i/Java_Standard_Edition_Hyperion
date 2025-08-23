package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.composition;

// Engine.java
public class Engine {
    private String type;
    private int horsePower;

    public Engine(String type, int horsePower) {
        super();
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + ", horsePower=" + horsePower + "]";
    }
}

