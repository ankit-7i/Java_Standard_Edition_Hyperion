package com.ankit.java.introduction.loopingconcept;

import java.util.Arrays;

public class ForEachDemo2SortingArray {
    public static void main(String[] args) {
        int []values = {78,34,12,90,10};
        System.out.println("Original Array Data : ");
        for(int value :values){
            System.out.println(value);
        }
        System.out.println("Sorted Array Data :");
        Arrays.sort(values);
        for(int value : values){
            System.out.println(value);
        }
    }
}
