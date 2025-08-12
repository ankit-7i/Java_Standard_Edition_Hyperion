package com.ankit.java.introduction.commandlinearg;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double Pi =3.14;
        double radius = Double.parseDouble(args[0]);
        double areaOfCircle = Pi * radius*radius;
        System.out.println("Area of Circle is :"+areaOfCircle);
    }
}
