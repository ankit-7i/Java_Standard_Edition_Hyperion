package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;

public class ConcatenateString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","is","Awesome");
        String concatenated = words.stream()
                .reduce("",(s1,s2)->s1+" "+s2).trim();
        System.out.println(concatenated);
    }
}
