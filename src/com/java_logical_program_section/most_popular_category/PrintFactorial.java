package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class PrintFactorial {
    public static long printFactorial(long num){
        long val = 1;
        for(long i = 1; i<= num;i++){
            val*=i;
        }
        return val;
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Value ");
        long val = sc.nextLong();

        long res = printFactorial(val);

        System.out.println(res);
        sc.close();

    }
}
