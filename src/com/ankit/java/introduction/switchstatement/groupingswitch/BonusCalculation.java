package com.ankit.java.introduction.switchstatement.groupingswitch;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your performance grade [A/B/C]");
        char grade = sc.nextLine().toUpperCase().charAt(0);
        double salary = 40000;
        double bonus = switch (grade){
            case 'A'->{
                System.out.println("High Level Performer");
                yield salary *0.20;
            }
            case 'B'->{
                System.out.println("Mid Level Performance");
                yield salary * 0.15;
            }
            case 'C'->{
                System.out.println("Basic Bonus");
                yield salary * 0.10;

            }
            default -> 0.0;
        };
        System.out.println("Bonus : "+bonus);
        System.out.println("Gross Salary : "+(salary + bonus));
        sc.close();
    }
}
// If we have block of statements while working with switch cases then we should compulsory use yield keyword.

