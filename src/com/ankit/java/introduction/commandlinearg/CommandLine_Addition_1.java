package com.ankit.java.introduction.commandlinearg;

public class CommandLine_Addition_1 {
    public static void main(String[] x) {
        String a =x[0];
        String b =x[1];
        //Converting String into interger
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int sum = num1+num2;
        System.out.println("Sum is : "+sum);
    }
}
