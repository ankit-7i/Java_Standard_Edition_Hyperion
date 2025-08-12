package com.ankit.java.introduction.switchstatement.normalswitch;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a character");
        char color = sc.next().toLowerCase().charAt(0);
        switch(color){
            case 'r' :
                System.out.println("Red");
                break;
            case 'g' :
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("invalid Input");
        }
        System.out.println("Completed");
        sc.close();
    }

}
