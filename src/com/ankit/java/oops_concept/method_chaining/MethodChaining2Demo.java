package com.ankit.java.oops_concept.method_chaining;




public class MethodChaining2Demo {
    public static void main(String[] args) {
        String s1 = "Hyderabad";

        // Chaining methods:
        // concat → toLowerCase → length
        int length = s1.concat(" is an IT city")  // "Hyderabad is an IT city"
                .toLowerCase()             // "hyderabad is an it city"
                .length();                 // returns total length

        System.out.println("The length is: " + length);
    }
}

/*
---------------------------------------------------
Key Points:
---------------------------------------------------
1. Method chaining makes code concise and readable.
2. The return type of each method decides what we can call next.
3. Common with classes like String, StringBuilder, Streams, etc.
*/

