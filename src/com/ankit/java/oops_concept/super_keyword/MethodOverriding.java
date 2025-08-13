package com.ankit.java.oops_concept.super_keyword;
/*
* @uthor : Ankit
* If Super class non static method name and sub class non static method name both are same (Method Overriding) and if we create an object for sub class then sub class method will be excuted (Bottom to top) , if we want to call super class method from sub class method body then we should use super keyword .
* **/
class Alpha{
    public String toString(){
        return "Alpha";
    }
}
class Beta extends Alpha{
    public String toString(){
        return "Beta";
    }
}
class Gamma extends Beta{
    public String toString(){
        return "Gamma";
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        Gamma g = new Gamma();
        System.out.println(g);
    }
}
