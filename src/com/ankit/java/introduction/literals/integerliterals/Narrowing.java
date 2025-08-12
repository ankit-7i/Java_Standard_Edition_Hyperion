package com.ankit.java.introduction.literals.integerliterals;

public class Narrowing {
    public static void main(String[] args) {
        short s = 127;
        byte b = (byte)s; // Explicit Type casting OR narrowing
        System.out.println(b);

    }
}
