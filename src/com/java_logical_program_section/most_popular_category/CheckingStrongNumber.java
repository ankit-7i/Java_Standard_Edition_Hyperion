package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class CheckingStrongNumber {
    public static boolean checkStrongNumber(int val) {
        int sum = 0, temp = val;

        while (temp != 0) {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        return sum == val;
    }

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter value to check: ");
        int val = sd.nextInt();


        boolean res = checkStrongNumber(val);

        if (res) {
            System.out.println(val + " is a Strong Number");
        } else {
            System.out.println(val + " is Not a Strong Number");
        }

        sd.close();
    }
}