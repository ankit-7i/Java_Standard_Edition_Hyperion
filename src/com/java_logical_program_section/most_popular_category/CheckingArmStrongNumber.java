package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class CheckingArmStrongNumber {
    public static  boolean ArmstrongCheck(int num){
        int sum = 0;
        int temp = num;

        while(temp != 0){
            int digit = temp%10;
            sum += digit*digit*digit;
            temp/=10;;

        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check ");
        int num = sc.nextInt();

        boolean result = CheckingArmStrongNumber.ArmstrongCheck(num);

        if (result) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
