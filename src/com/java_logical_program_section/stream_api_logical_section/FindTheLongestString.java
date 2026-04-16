package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;

public class FindTheLongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Springboot","Microservices","Oracle");
        String longest = words.stream().reduce((w1,w2)->w1.length()>w2.length() ? w1 : w2).orElse("");
        System.out.println(longest);
    }
}
