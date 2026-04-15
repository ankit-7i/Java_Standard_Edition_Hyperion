package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream", "api");
        List<String> uppercaseString = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseString);
    }
}
