package com.ankit.java.introduction.variables;

public class Test {
    static int x =100;
    int y = 200;
    public void accept (int a){
        int b = 400;
        System.out.println("Class Valiable :"+Test.x);
        System.out.println("Instance Variable :"+y);
        System.out.println("Parameter Variable :"+a);
        System.out.println("Local Variable :"+b);
    }
}
