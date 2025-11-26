package com.java.streamapi.filter;

import java.util.Arrays;

public class PositiveNumberFinder {
    public static void main(String[] args) {
        Integer [] numbers = {-10, -5, 0, 5, 10, 15, -20};

        Arrays.stream(numbers).filter(number -> number>0).forEach(System.out::println);
    }
}
