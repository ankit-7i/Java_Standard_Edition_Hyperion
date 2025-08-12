package com.ankit.java.introduction.switchstatement.normalswitch;
import java.util.Scanner;
public class MenuBasedCalculation {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();

            int num2 = sc.nextInt();

            String operator = sc.next().toUpperCase();

            switch (operator){
                case "ADD" -> {

                    int res = num1 +num2 ;
                    System.out.println("Result :- "+res);
                }
                case "SUB" -> {

                    int res = num1 - num2 ;
                    System.out.println("Result :- "+res);
                }
                case "MUL" -> {
                    int res = num1 * num2 ;
                    System.out.println("Result :- "+res);
                }
                case "DIV" -> {

                    if(num2 == 0) {
                        System.out.println("Cannot divide by zero");

                    }else{
                        int res = num1 / num2 ;
                        System.out.println("Result :- "+res);
                    }
                }

                default -> System.out.println("Invalid choice");
            }

            sc.close();

        }


    }


