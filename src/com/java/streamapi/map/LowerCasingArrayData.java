package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;

public class LowerCasingArrayData {
    public static void main(String[] args) {
        List<String> Lowercasingthevalue = Arrays.asList("ANKIT","Sipun","SSSSS","EEEEE","UUWUWUWUWU");
        Lowercasingthevalue.stream().map(str ->str.toLowerCase()).forEach(System.out::println);
    }
}
