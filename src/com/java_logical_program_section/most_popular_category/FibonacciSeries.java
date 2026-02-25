package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0 , b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range ");
        int range = sc.nextInt();

        System.out.println(a+" "+b+" ");
        for(int i =3;i<=range;i++){
            int c = a+b;
            System.out.println(c +" ");
            a=b;
            b=c;
        }

    }
}
