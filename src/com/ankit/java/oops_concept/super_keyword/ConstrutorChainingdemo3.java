package com.ankit.java.oops_concept.super_keyword;

class  Alpha2{
    public Alpha2(String name){
        super();
        System.out.println("Institute Name is : "+name);
    }

}
class Beta2 extends Alpha2{
    public Beta2(){
        super("NareshIT");
        System.out.println("No Argument Construtor of Beta2 Class");
    }
}
public class ConstrutorChainingdemo3 {
    public static void main(String[] args) {
        new Beta2();
    }
}
