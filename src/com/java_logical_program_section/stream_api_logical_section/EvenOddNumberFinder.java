package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumberFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n->n%2==1)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(oddNumbers);
    }
}
