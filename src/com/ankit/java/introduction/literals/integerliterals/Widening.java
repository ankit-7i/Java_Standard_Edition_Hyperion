package com.ankit.java.introduction.literals.integerliterals;
// Assigning smaller data type value to bigger data type
public class Widening {
    public static void main(String[] args) {
        byte b  =125;
        short s = b; // Automatic type casting OR wideing
        System.out.println(s);
        short x = 345;
        int y = x;
        System.out.println(y);
    }
}
