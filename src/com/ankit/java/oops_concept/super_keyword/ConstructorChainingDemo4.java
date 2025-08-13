package com.ankit.java.oops_concept.super_keyword;
class Super {
    public Super(){
        super();
        System.out.println("No Args Construtor of Super class !!!");
    }
    public Super(int val){
    this();
        System.out.println("Parametrized Construtor of Super Class !!!"+val);
    }
}
class Sub extends Super {
    public Sub(int data){
        super(data);
        System.out.println("Parameterized Constructor of Sub class!!!");
    }
}

public class ConstructorChainingDemo4 {
    public static void main(String[] args) {
        new Sub(15);
    }
}
