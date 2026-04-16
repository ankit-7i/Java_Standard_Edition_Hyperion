package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;

public class StringMatches_a_Condition {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java", "stream api","Lambda");
        boolean contains = stringList.stream().anyMatch(s->s.contains("api"));
        System.out.println(contains);
    }
}
