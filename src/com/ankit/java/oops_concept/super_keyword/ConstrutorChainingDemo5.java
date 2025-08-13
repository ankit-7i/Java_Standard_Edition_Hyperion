package com.ankit.java.oops_concept.super_keyword;

class Base {
    public Base (){
        this("Java");
        System.out.println("No Argument Construtor of Base Class ");
    }
    public Base (String lang){
        System.out.println("Parameterized Constuctor of Base class"+lang);
    }
}
class Derived extends Base {
    public Derived(){
        super();
        System.out.println("No Argument Construtor of Derived class ");
    }

}


public class ConstrutorChainingDemo5 {
    public static void main(String[] args) {
        new Derived();
    }
}
