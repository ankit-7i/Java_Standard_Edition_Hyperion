package com.ankit.java.introduction.switchstatement.groupingswitch;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your subject grade [A or B / C/ D]");
        char grade = sc.next().toUpperCase().charAt(0);
        String res = switch(grade){
            case 'A','B' ->"Excellent!";
            case 'C'->"Good";
            case 'D'->"Average";
            default -> "No Grade";


        };
        System.out.println("Your Grade is :"+res);
        sc.close();

    }
}
