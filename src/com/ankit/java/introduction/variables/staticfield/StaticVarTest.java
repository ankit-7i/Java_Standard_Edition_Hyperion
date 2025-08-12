package com.ankit.java.introduction.variables.staticfield;

public class StaticVarTest {
    static int x =100;

    public static void main(String[] args) {
        StaticVarTest t1 = new StaticVarTest();
        StaticVarTest t2 = new  StaticVarTest();

        ++t1.x; --t2.x;
        System.out.println(t1.x);
        System.out.println(t2.x);

    }
}
