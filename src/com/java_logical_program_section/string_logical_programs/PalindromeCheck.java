package com.java_logical_program_section.string_logical_programs;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "Ankit";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        if (sb.toString().equals(str)) {
            System.out.println("true");
        }
        else  {
            System.out.println("false");
        }
    }
}
