package com.java_logical_program_section.array_logical_programs;

import java.util.*;

public class FindingCommonElemntsIn2Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the elements of the first array");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of the second array");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("First Array: "+ Arrays.toString(arr1));
        System.out.println("Second Array: "+ Arrays.toString(arr2));

        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        List<Integer> commonElement = new ArrayList<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElement.add(num);
            }
        }
        System.out.println("Common Elements: "+ commonElement);
    }
}
