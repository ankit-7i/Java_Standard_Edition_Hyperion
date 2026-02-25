package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int a  = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b = sc.nextInt();

        int gcd = 1;

        for (int i =1 ; i <= a && i<=b; i++ ){
            if(a%i==0 && b %i == 0){
                gcd= i;
            }
        }

        int lcm = (a * b)/gcd;
        System.out.println( "GCD ="+gcd+" LCM = "+lcm);
    }
}
