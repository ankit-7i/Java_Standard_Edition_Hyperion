package com.ankit.java.oops_concept.interface_concept.multiple_inheritance_through_intreface;

interface Alpha {
    void m1();
}

interface Beta {
    void m1();
}

class Implementer implements Alpha, Beta {
    @Override
    public void m1() {
        System.out.println("Multiple Inheritance is Possible");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        new Implementer().m1();
    }
}

