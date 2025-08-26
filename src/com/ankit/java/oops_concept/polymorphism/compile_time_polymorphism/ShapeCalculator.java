package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class ShapeCalculator
{
    final double PI =3.14;
    public void calculateArea(int side)
    {
        System.out.println("Area of the Square : "+(side* side));
    }
    public void calculateArea(int length, int width)
    {
        System.out.println("Area of the Rectangle : "+(length * width));
    }
    public void calculateArea(double radius) {
        System.out.println("Area of the Circle is : "+(PI*radius * radius));
    }
}
