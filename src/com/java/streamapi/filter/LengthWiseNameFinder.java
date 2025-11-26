package com.java.streamapi.filter;

import java.util.Arrays;

public class LengthWiseNameFinder {
    public static void main(String[] args) {
        String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
        Arrays.stream(words).filter(word ->word.length()>3).forEach(System.out::println);
    }
}
