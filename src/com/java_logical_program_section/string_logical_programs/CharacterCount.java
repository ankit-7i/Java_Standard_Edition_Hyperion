package com.java_logical_program_section.string_logical_programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void countCharacters(String s1) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args) {

        countCharacters("programming");
    }
}
