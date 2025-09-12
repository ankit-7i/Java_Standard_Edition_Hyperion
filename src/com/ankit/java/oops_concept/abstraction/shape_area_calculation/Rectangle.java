package com.ankit.java.oops_concept.abstraction.shape_area_calculation;

public class Rectangle extends Shape {


    double length ;
    double breadth;


    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        double Area = length* breadth;
        return Area;
    }

    @Override
    void printDetails() {
        System.out.println("Length is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Area Of Rectangle is "+getArea());

    }

}
