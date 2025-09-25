package com.ankit.java.exception_handling_In_java.realtime_scenrio;

import java.util.Scanner;

public class AreaCalculator
{
    public static double calculateArea(double length , double width)
    {
        if (length <=0 ||  width<=0)
        {
            throw new	IllegalArgumentException("Error: Length and width must be > 0.");
        }
        return length* width;

    }

    public static void main(String[] args)
    {
        try
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length ");
            double length = sc.nextDouble();


            System.out.print("Enter width ");

            double width = sc.nextDouble();


            AreaCalculator.calculateArea(length, width);
            System.out.println("Area of rectangle with length" + length+" and width "+width+" is:"+calculateArea(length, width));
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();

        }

    }

}

