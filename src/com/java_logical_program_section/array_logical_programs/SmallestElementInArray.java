package com.java_logical_program_section.array_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements ");
        for(int i = 0; i< size ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array "+ Arrays.toString(arr));

        int  min=arr[0];
        for(int i = 0; i< size ;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element is "+ min);

    }
}
