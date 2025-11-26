package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
        List<String> ToUpperCase = Arrays.stream(names).map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(ToUpperCase);

    }
}
