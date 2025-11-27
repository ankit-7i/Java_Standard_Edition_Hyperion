package com.java.streamapi.mcq;

import java.util.Arrays;
import java.util.List;

public class Test12 {


        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry");
            long count = words.stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("A"))
                    .count();
            System.out.println(count);
        }
    }

