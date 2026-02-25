package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class CheckingPalindrome {


    public static boolean checkingPalindrome(int num){
        int rev = 0,temp = num;
        while (temp !=0){
            int digit = temp %10;
            rev = rev * 10 +digit;
            temp/=10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check ");
        int num = sc.nextInt();

        boolean res = checkingPalindrome(num);
        if(res){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
}
