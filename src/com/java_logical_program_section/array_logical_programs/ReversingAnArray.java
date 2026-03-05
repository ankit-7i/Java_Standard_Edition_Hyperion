package com.java_logical_program_section.array_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
             arr[i] =  sc.nextInt();
        }
        System.out.println("Original Array"+ Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array"+ Arrays.toString(arr));
    }
}
