package com.ankit.java.introduction.commandlinearg;

public class Read_Gender {
    public static void main(String[] args) {
        String gender = args[0];
        char gen = gender.charAt(0);
        System.out.println("Your Gender is :"+gen);
    }
}
