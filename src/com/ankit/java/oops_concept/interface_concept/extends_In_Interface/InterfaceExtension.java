package com.ankit.java.oops_concept.interface_concept.extends_In_Interface;

abstract interface A {
    void m1();
}

interface B extends A {
    void m2(); // contains 2 abstract methods (m1 from A + m2)
}

class Implementer implements B {
    @Override
    public void m1() {
        System.out.println("m1 method implemented");
    }

    @Override
    public void m2() {
        System.out.println("m2 method implemented");
    }
}

public class InterfaceExtension {
    public static void main(String[] args) {
        Implementer i = new Implementer();
        i.m1();
        i.m2();
    }
}

