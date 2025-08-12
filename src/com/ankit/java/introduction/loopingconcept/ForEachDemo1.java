package com.ankit.java.introduction.loopingconcept;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int []arr ={23,78,45,12};
        System.out.println("By using Ordinary for loop : ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("By using for Each loop : ");
        for(int x :arr){
            System.out.println(x);
        }
    }
}
