package com.java_logical_program_section.stream_api_logical_section;

import java.util.Optional;

public class FirstNon_RepeatedCharacter {
    public static void main(String[] args) {
        String value = "SSwiggy";
        Optional<Character> firsrtNonRepeated  = value.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> value.indexOf(c) == value.lastIndexOf(c))
                .findFirst();
        System.out.println(firsrtNonRepeated.orElse(null));
    }
}
