package com.java.streamapi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeWord {
    public static void main(String[] args) {
        String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
        List<String> palindromewordlist = Arrays.stream(words).filter(PalindromeWord::isWordPalindrome).collect(Collectors.toList());

        System.out.println("Palindrome Words: " + palindromewordlist);

    }
    private static boolean isWordPalindrome(String word){
        if (word == null || word.isEmpty()){
            return false;
        }
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
