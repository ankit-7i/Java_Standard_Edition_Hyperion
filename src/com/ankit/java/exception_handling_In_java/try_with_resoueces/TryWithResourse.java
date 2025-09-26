package com.ankit.java.exception_handling_In_java.try_with_resoueces;

import java.io.BufferedReader;

public class TryWithResourse {
    public static void main(String[] args) throws Exception {
        FileResourse fr = new FileResourse();
        DatabaseResourse dr = new DatabaseResourse();

        try (fr; dr) {
            System.out.println(10 / 0); // Will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Divide By zero problem");
        }

        System.out.println("Main method completed!!!");
    }
}

