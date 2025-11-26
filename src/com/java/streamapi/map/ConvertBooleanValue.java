package com.java.streamapi.map;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertBooleanValue {
    public static void main(String[] args) {
        Boolean[] flags = {true, false, true, false, true};

        List<String> yesNoValues = Arrays.stream(flags)
                .map(ConvertBooleanValue::convertToYesNo)
                .collect(Collectors.toList());

        System.out.println("Yes/No Values: " + yesNoValues);
    }

    private static String convertToYesNo(Boolean flag) {
        return flag ? "Yes" : "No";
    }
}