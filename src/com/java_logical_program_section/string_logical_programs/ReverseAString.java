package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        for(int i =charArray.length-1; i>=0 ;i--){
            System.out.print(charArray[i]);
        }
    }
}
