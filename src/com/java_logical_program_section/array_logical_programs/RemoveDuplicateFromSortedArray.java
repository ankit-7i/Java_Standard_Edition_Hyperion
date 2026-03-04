package com.java_logical_program_section.array_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
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

        //Let's Sort the array using bubble sort

        int  temp =0;
        for (int i = 0 ; i<size ;i++){
            for (int j = i+1 ; j < size ;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array elements are: "+ Arrays.toString(arr));
    }

    // Let's Remove  duplicate value from arra
}
