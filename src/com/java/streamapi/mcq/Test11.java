package com.java.streamapi.mcq;

import java.util.Arrays;
import java.util.List;

public class Test11 {

        public static void main(String[] args) {
            List<List<String>> list= Arrays.asList(Arrays.asList("1","2","3","4","5"));
            list.stream().flatMap(x -> list.stream())
                    .forEach(System.out::print);
        }
    }



