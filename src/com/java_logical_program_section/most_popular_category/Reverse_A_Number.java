package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class Reverse_A_Number {

    public static int reverseA_Number(int num){
        int rev =0 ;

        while (num != 0){
            int digit = num%10;
            rev = rev* 10 +digit;
            num/=10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a num to reverse ");
        int num = sc.nextInt();

        int res = reverseA_Number(num);

        System.out.println(res);
    }
}
