package com.ankit.java.oops_concept.super_keyword;

class  Alpha1{
    public Alpha1(){
        super();
        System.out.println("Alpha class no argument construtor !!!");
    }
}
class Beta1 extends Alpha {
    public Beta1(){
        super();
        System.out.println("Beta class no argument Constuctor !!!");
    }
}
class Gamma1 extends  Beta1{
    public Gamma1(){
        super();
        System.out.println("Gamma Class No argumant Constructor !!!");
    }
}
public class ConstrutorChainingDemo1 {
    public static void main(String[] args) {
        new Gamma1();
    }
}
