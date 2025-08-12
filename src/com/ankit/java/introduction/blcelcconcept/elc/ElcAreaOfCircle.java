package com.ankit.java.introduction.blcelcconcept.elc;

import com.ankit.java.introduction.blcelcconcept.blc.AreaOfCircle;

import java.util.Scanner;

public class ElcAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = Double.parseDouble(sc.nextLine());
        String Circle = AreaOfCircle.getAreaOfCircle(radius);
        double areaOfCircle = Double.parseDouble(Circle);
        System.out.printf("Area of circle is :%.2f",areaOfCircle);
        sc.close();
    }
}
