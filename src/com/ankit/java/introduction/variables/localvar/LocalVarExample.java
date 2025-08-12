package com.ankit.java.introduction.variables.localvar;

public class LocalVarExample {
    // Method Execution Flow
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        m1();
        System.out.println("Main Method Ended !");
    }

    public static void m1() {
        System.out.println("M1 Method Started");
        m2();
        System.out.println("M1 Method Ended !");

    }
    public static void m2(){
        System.out.println("M2 Method Started");
        int x = 900;
        System.out.println("x Value is : "+x);
    }

}
