package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class FindLargest_and_Smallest_digit_InaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int min = 9 , max = 0;
        while(num >0){
            int digit = num %10;
            if (digit < min){
                min = digit;
            }
            if (digit > max){
                max = digit;
            }
            num /= 10;

        }

        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}
