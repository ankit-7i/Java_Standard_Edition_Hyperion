package com.ankit.java.introduction.loopingconcept;

public class ForEachDemo4HeterogeneousArray {
    public static void main(String[] args) {
        Object []arr = {12,23.90,'A',"NIT",false};
        System.out.println("Printing the array data : ");
        for(Object obj :arr){
            System.out.println(obj);
        }
    }
}
