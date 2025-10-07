package com.ankit.java.exception_handling_In_java.exception_rules;

public class VariableInitialization {
    public static void main(String[] args) {
        int x;

        try {
            x = 100;
            System.out.println(x);
        } catch (Exception e) {
            x = 200;
            System.out.println(x);
        }
    }
}

