package com.ankit.java.introduction.commandlinearg;

public class CommandByDifferentCriteria {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Length is 0");
        }
        else if(args.length ==1){
            int num = Integer.parseInt(args[0]);
            System.out.println("Cube of "+num+" is :"+(num*num*num));
        }
        else if(args.length==2){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Sum is :"+(num1+num2));
        }
    }
}
