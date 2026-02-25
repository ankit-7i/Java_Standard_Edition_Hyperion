package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class CheckingPerfectNumber {
    public static boolean checkingPerfectNumber(int num){
        int sum = 0;

        for (int i = 1;i<=num/2;i++){
            if(num % i == 0){
                sum+=i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check ");
        int num=sc.nextInt();

        boolean res = checkingPerfectNumber(num);

        if (res){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}
