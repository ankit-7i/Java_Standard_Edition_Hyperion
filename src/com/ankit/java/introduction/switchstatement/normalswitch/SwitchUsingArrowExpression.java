package com.ankit.java.introduction.switchstatement.normalswitch;

import java.util.Scanner;

public class SwitchUsingArrowExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your fav language ");
        String lang = sc.nextLine().toUpperCase();
        switch (lang){
            case "C"-> System.out.println(" Your fav language C language");
            case "JAVA"-> System.out.println(" Your fav language JAVA language");
            case "RUST"-> System.out.println(" Your fav language RUST language");
            case "GOLANG"-> System.out.println(" Your fav language GOlang language");
            default -> System.out.println("Invalid Language Entered");


        }
        System.out.println("Thank You !");
        sc.close();
    }
}
