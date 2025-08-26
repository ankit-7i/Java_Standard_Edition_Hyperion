package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class ElcCalculation {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.add(13, 24);
        c.add(23.89, 78.7);
        c.multiply(3, 7);
        c.multiply(90.0, 87);
    }

}
