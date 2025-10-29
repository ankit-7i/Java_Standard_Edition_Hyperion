package com.ankit.java.array_concept.basic;

import java.util.Scanner;

public class DeclaratiionOfArray {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,1};


        int arr1[] = new int[]{12,344,566};

        Scanner sc = new Scanner(System.in);
        int arr2[] = new int[5];
        System.out.println("Enter Array elements ");

        for(int i=0;i<arr2.length;i++) {
            arr2[i]=sc.nextInt();
        }

        for(int i= 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i =0 ; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
