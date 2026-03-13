package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class ExtractDigitFromAStringandCalcullateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                sum += ch -'0';

            }
        }
        System.out.println("Sum of Digit in the String  "+sum);
    }
}
