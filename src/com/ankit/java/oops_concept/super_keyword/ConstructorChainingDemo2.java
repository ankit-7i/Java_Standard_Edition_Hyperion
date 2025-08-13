package com.ankit.java.oops_concept.super_keyword;
// Default no arg constrtor and super() is automatically addes by java compiler
class A {
    public A(){
        System.out.println("A");
    }
}
class B extends A {

}
class C extends B{
    C(){
        System.out.println("C");
    }
}
public class ConstructorChainingDemo2 {
    public static void main(String[] args) {
        new C();
    }
}
