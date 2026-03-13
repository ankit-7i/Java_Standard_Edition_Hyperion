package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class StringContainsOnlyDigitRegxStyle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        if(str.matches("\\d+")){
            System.out.println("The string contains only digits");
        }
        else{
            System.out.println("The string does not contains only digits");
        }
    }
}
