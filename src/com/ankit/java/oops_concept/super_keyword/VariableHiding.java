package com.ankit.java.oops_concept.super_keyword;

class Father
{
    protected double balance = 50000;

}
class Son extends Father
{
    protected double balance  = 18000;
    public void getBalance(){
        System.out.println("Father Balance is : "+super.balance);
        System.out.println("Son Balance is : "+this.balance);
    }
}


public class VariableHiding {
    public static void main(String[] args) {
        Son son = new Son();
        son.getBalance();
    }
}
