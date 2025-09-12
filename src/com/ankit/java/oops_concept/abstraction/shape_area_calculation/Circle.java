package com.ankit.java.oops_concept.abstraction.shape_area_calculation;

public class Circle extends Shape {

    final double PI = 3.14;
    double radius;



    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double getArea() {
        double Area = PI * radius * radius;
        return Area;
    }

    @Override
    void printDetails() {
        System.out.println("Radius is "+radius);
        System.out.println("Area Of Circle is  : "+getArea());

    }

}

