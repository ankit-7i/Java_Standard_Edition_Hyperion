package com.java.streamapi.filter;


import java.util.ArrayList;
import java.util.List;

record OCJPAP (String name , double score , String status){}
public class MeritFinder {
    public static void main(String[] args) {
        List<OCJPAP> MeritList = new ArrayList<>();
        MeritList.add(new OCJPAP("Ankit",66.23,"PASS"));
        MeritList.add(new OCJPAP("Ashok",78.77,"PASS"));


        MeritList.stream()
                          .filter(ocjpap -> ocjpap.score() > 75)
                                                                        .map(ocjpap -> ocjpap.name())
                                                                                                            .forEach(System.out::println);
    }
}
