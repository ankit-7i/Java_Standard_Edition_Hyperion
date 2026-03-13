package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class StringContainsOnlyDigit {
    public static boolean isOnlyContainsDigit(String str){
        for(int i =0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        if(isOnlyContainsDigit(str)){
            System.out.println("The string contains only digits");
        }
        else{
            System.out.println("The string does not contains only digits");
        }
        sc.close();
    }



}
