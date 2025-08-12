package com.ankit.java.introduction.commandlinearg;

public class Find_Square {
    public static void main(String[] args) {
        int num = Integer.parseInt(args [0]);
        System.out.println("Square of "+num+" is :"+(num*num));
    }
}
