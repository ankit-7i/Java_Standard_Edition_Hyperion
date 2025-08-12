package com.ankit.java.introduction.Operator.booleanopearator;

public class Test2 {
    public static void main(String[] args) {
        int z =5;
        if(++z >6 & ++z>6){
            System.out.println("Inside if");
            z++;

        }
        System.out.println(z);
    }
}
