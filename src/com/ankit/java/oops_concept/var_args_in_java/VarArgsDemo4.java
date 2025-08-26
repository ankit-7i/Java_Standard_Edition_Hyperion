package com.ankit.java.oops_concept.var_args_in_java;
class Hetro {
    public void accpetHetroData(Object ...values){
        for(Object value : values){
            System.out.println(value);
        }
    }
}
public class VarArgsDemo4 {
    public static void main(String[] args) {
        Hetro h1 = new Hetro();
        h1.accpetHetroData(23,'A',56.90,new String("java"));
    }
}
// var args can hold heterogeneous types of data
