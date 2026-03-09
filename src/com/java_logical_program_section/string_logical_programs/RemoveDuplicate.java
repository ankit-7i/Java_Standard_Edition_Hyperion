package com.java_logical_program_section.string_logical_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static String removeDuplicates(String s){
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray())
            set.add(c);
        StringBuilder sb = new StringBuilder();
        for (char c : set)
            sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Programming"));

    }
}
