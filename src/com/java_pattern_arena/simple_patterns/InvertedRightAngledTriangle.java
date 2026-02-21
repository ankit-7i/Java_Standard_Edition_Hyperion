package com.java_pattern_arena.simple_patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int col = n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

