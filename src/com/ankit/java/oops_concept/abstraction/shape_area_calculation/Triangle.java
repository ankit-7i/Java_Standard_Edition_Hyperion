package com.ankit.java.oops_concept.abstraction.shape_area_calculation;

public class Triangle extends Shape {

    double base ;
    double height;




    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        double Area = (0.5)* base * height;

        return Area;
    }

    @Override
    void printDetails() {
        System.out.println("Base is "+base);
        System.out.println("height is "+height);
        System.out.println("Area Of Triangle is : "+getArea());

    }

}

