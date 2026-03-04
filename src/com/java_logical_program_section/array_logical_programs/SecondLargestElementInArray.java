package com.java_logical_program_section.array_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter " + size + " array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: "+ Arrays.toString(arr));

        int max  = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
        }
        else if (arr[])
    }
}
