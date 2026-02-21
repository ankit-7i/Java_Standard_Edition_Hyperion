package com.java_pattern_arena.simple_patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){

            // spaces
            for(int j=1;j<=num-i;j++)
                System.out.print(" ");

            // stars
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");

            System.out.println();
        }
    }
}