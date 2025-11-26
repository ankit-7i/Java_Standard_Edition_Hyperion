package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractFirtstCharFromEachWord {
    public static void main(String[] args) {
        String []names = {"James", "Aryan", "Vibha", "Aniket"};

        List<String> FirstLetter = Arrays.stream(names).map(name->String.valueOf(name.charAt(0))).collect(Collectors.toList());
        System.out.println("First Letters: "+FirstLetter);
    }
}
