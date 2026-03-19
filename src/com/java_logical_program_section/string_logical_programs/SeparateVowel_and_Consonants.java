package com.java_logical_program_section.string_logical_programs;

import java.util.Scanner;

public class SeparateVowel_and_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =  sc.nextLine().toLowerCase();
        char[] charArray = str.toCharArray();
        String vowels ="";
        String consonants="";
       for(char ch : charArray){
           if(Character.isLetter(ch)){
               if (ch =='a' || ch == 'e' || ch =='i' || ch =='o'  || ch =='u'){
                   vowels += ch + " ";
               }
               else {
                   consonants += ch + " ";
               }
           }
       }
       System.out.println(vowels);
       System.out.println(consonants);

    }
}
