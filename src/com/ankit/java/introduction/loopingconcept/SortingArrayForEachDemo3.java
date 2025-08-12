package com.ankit.java.introduction.loopingconcept;

import java.util.Arrays;

public class SortingArrayForEachDemo3 {
    public static void main(String[] args) {
        String [] cities ={"Hyd","Indore","Mumbai","Ajmer"} ;
        System.out.println("Original Array Data : ");
        for(String city :cities){
            System.out.println(city);
        }
        System.out.println("Sorted based on alphabetical Order :");
        Arrays.sort(cities);
        for(String city : cities){
            System.out.println(city);
        }
    }
}
