package com.ankit.java.oops_concept.super_keyword;
import java.util.Scanner;

class Shape
{
    protected int x;

    public Shape(int x)
    {
        this.x = x;
        System.out.println("x value is :" + x);
    }
}

class Square extends Shape
{
    public Square(int side)
    {
        super(side);
    }

    public void getAreaOfSquare()
    {
        double area = this.x * this.x;
        System.out.println("Area of Square is :" + area);
    }
}

class Rectangle extends Shape
{
    protected int breadth;

    public Rectangle(int length, int breadth)
    {
        super(length);
        this.breadth = breadth;
    }

    public void getAreaOfRectangle()
    {
        double area = this.x * this.breadth;
        System.out.println("Area of Rectangle is :" + area);
    }
}

public class ShapeDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the Square :");
        int side = Integer.parseInt(sc.nextLine());

        Square ss = new Square(side);  // Example: side = 10
        ss.getAreaOfSquare();

        System.out.println("--------------------------------------------------");

        System.out.print("Enter the length of the Rect :");
        int length = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the breadth of the Rect :");
        int breadth = Integer.parseInt(sc.nextLine());

        Rectangle rr = new Rectangle(length, breadth);
        rr.getAreaOfRectangle();

        sc.close();
    }
}

