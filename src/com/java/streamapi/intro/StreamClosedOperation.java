package com.java.streamapi.intro;


import java.util.stream.Stream;
public class StreamClosedOperation {
        public static void main(String[] args) {
            Stream<Integer> strm = Stream.of(1,2,3,4,5,6,7,8,9,10);

            System.out.println(strm);     // Printing Stream reference
            strm.forEach(System.out::println);

            System.out.println("-------------");

            // This will throw IllegalStateException (stream already consumed)
            strm.forEach(System.out::println);
        }
    }

