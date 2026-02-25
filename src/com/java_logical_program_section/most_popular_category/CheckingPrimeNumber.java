package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class CheckingPrimeNumber {

    public static boolean isPrimeNo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;   // not prime
            }
        }

        return true; // prime
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for prime number check:");
        int num = sc.nextInt();

        if (isPrimeNo(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
}