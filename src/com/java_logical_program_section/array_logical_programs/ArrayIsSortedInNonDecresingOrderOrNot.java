package com.java_logical_program_section.array_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedInNonDecresingOrderOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: " + Arrays.toString(arr));

        boolean flag = true;

        for (int i = 0; i < size - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("Array elements are sorted in non-decreasing order");
        } else {
            System.out.println("Array elements are not sorted in non-decreasing order");
        }

        sc.close();
    }
}