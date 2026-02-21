package com.java_pattern_arena.simple_patterns;

import java.util.Scanner;

public class HollowTrianglePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int num = sc.nextInt();

        for(int row=1; row<=num; row++){

            // spaces
            for(int col=1; col<=num-row; col++){
                System.out.print(" ");
            }

            // stars
            for(int star=1; star<=2*row-1; star++){

                if(star==1 || star==2*row-1 || row==num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}