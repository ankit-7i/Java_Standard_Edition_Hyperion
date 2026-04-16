package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","C++","Python","JavaScript","C#","Ruby","Go");
        Map<Integer,List<String>> gropingByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(gropingByLength);
    }
}
