package com.java_pattern_arena.simple_patterns;

import java.util.Scanner;

public class BlockDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n = sc.nextInt();

        // upper part of diamond
        for(int i =1; i<=n;i++){
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= (2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Part of diamond
        for (int i = n-1;i>=1;i--){
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
