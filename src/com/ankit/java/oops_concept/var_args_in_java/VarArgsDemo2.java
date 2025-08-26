package com.ankit.java.oops_concept.var_args_in_java;

class Addition
{
    public void addParametervalues (int ...values){
        int sum = 0;
        for(int value : values){
            sum = sum+value;
        }
        System.out.println("Sum of Parameter is :"+sum);
    }
}
public class VarArgsDemo2 {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.addParametervalues(0);
        a.addParametervalues(10);
        a.addParametervalues(10,20);
        a.addParametervalues(10,20,30);
    }
}