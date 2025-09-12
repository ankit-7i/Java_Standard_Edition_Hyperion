package com.ankit.java.oops_concept.abstraction.shape_area_calculation;

import java.util.Scanner;

public class ShapeELC
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Choose a Shape you want to calculate Area ");
        System.out.println("1)Rectangle");
        System.out.println("2)Circle");
        System.out.println("3) Triangle");

        int choice  = Integer.parseInt(sc.nextLine());

        Shape s = null;
        switch(choice ) {

            case 1->{
                System.out.println("Type - > Rectangle ");
                System.out.print("Enter Length ");
                double length = Double.parseDouble(sc.nextLine());
                System.out.print("Enter breadth");
                double breadth = Double.parseDouble(sc.nextLine());
                s = new Rectangle(length,breadth);
                s.getArea();
                s.printDetails();

            }
            case 2->{
                System.out.println("Type -> Circle ");
                System.out.print("Enter Radius :");
                double radius = Double.parseDouble(sc.nextLine());
                s = new Circle(radius);
                s.getArea();
                s.printDetails();

            }
            case 3->{
                System.out.println("Type -> Triangle");
                System.out.print("Enter Base :");
                double base = Double.parseDouble(sc.nextLine());
                System.out.print("Enter height value :");
                double height = Double.parseDouble(sc.nextLine());
                s = new Triangle(base,height);
                s.getArea();
                s.printDetails();
            }
            default ->{
                System.err.println("Error - Invalid Choice choose in btween 1- 3");
            }


        }

sc.close();

    }
}

