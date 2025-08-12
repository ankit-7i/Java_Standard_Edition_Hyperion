package com.ankit.java.introduction.blcelcconcept.elc;

import com.ankit.java.introduction.blcelcconcept.blc.Square;

import java.util.Scanner;

public class ElcSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square :");
        int side = Integer.parseInt(sc.nextLine());
        System.out.println("Area of Rectangle is : "+ Square.getAreaOfSquare(side));
        sc.close();
    }
}
