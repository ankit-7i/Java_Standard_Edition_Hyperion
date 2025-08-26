package com.ankit.java.oops_concept.var_args_in_java;
class ArrayAndValues{
    public void accept(int ...arr){
        for(int x :arr){
            System.out.println(x);
        }
    }
}
public class VarArgsDemo3 {
    public static void main(String[] args) {
        ArrayAndValues h= new ArrayAndValues();
        int []values = {12,30,2,334,16};
        h.accept(values);
        System.out.println("___________");
        h.accept(45,23,43,55,67,90);
    }
}
// var args can acceept array and direct values