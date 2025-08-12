package com.ankit.java.introduction.blcelcconcept.elc;

import com.ankit.java.introduction.blcelcconcept.blc.ConditionCalculation;

import java.util.Scanner;

public class ElcConditionCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Result is : "+ ConditionCalculation.getSquareAndCube(num));
        sc.close();
    }
}
