package com.java.streamapi.filter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringContainingTargetElement {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
        Arrays.stream(names).filter(name ->name.contains("a") || name.contains("A")).forEach(System.out::println);

    }
}
