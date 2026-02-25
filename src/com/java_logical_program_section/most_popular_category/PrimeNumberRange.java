package com.java_logical_program_section.most_popular_category;

import java.util.Scanner;

public class PrimeNumberRange {

    public static boolean isPrime(int num){

        if(num <= 1){
            return false;
        }
        for(int i = 2; i <=num/2; i++){

            if(num % i == 0){
                return false;
            }

        }
        return  true;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range : ");
        int range = sc.nextInt();

        int count = 0;
        System.out.println("Prime numbers from 1 to "+ range + "are :");

        for(int i = 1; i<= range;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
                count++;
            }
        }

        System.out.println("\n Total Number Of Prime Numbers "+ count);

        sc.close();


    }
}
