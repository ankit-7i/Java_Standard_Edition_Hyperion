package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class ExtractDigitFromAStringandCalcullateSumUsingStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int sum = str.chars()
                .filter(Character::isDigit)
                .map(c -> c-'0')
                .sum();
        System.out.println(sum);
    }
}
