package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;

public class MaxMinFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxNumbers = numbers.stream()
                .max(Integer::compare)
                .orElseThrow();
        System.out.println(maxNumbers);

        int minNumbers = numbers.stream()
                .min(Integer::compare)
                .orElseThrow();
        System.out.println(minNumbers);
    }
}
