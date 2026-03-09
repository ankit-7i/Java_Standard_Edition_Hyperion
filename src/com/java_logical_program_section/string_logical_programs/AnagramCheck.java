package com.java_logical_program_section.string_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String");
        String s2 = sc.nextLine();

        System.out.println("Strings Anagrams: "+ isAnagram(s1,s2));

    }
}
