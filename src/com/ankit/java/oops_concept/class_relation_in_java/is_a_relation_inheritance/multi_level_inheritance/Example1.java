package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.multi_level_inheritance;

class A1 {
    public A1() {
        System.out.println("Hi");
    }
}
class B1 extends A1 {
    public B1(){
        System.out.println("Hello");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("By");
    }
}
public class Example1 {
    public static void main(String[] args) {
        C1 c = new C1();

    }
}
