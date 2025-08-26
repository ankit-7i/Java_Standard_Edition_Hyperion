package com.ankit.java.oops_concept.var_args_in_java;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

class Sample {
    /*
    public void displayParameter (int ...x,int  ...y){

    }
    public void displayParameter (int ...x,int y ){

    }
    public void displayParameter(int ...x,float ...y){

    } */
    public  void displayParameter (int x ,int ...y){
        System.out.println("X value is : "+x);
        for(int z : y){
            System.out.println(z);
        }
    }
}
public class VarArgsDemo5 {
    public static void main(String[] args) {
        Sample s = new Sample();
        int[] arr ={100,300,400,500};
        s.displayParameter(100,arr);
    }
}
