package com.java.streamapi.filter;

import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> listOfName = List.of(
                "Aryan", "Ankit", "Raj", "Rohit", "Aniket",
                "Raj", "Aryan", "Ajinkya", "Ankit"
        );

        listOfName.stream()
                .distinct()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
