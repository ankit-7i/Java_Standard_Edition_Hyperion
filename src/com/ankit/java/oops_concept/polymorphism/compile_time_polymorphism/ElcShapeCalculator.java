package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class ElcShapeCalculator {

    public static void main(String[] args) {
        ShapeCalculator  sc = new ShapeCalculator ();
        sc.calculateArea(45);
        sc.calculateArea(78.6);
        sc.calculateArea(67, 89);

    }

}

