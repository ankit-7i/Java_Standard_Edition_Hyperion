package com.ankit.java.oops_concept.var_args_in_java;
/*
Var Args in java :
(i) It is known as Variable Argument and it was introduced from JDK 1.5V onwards.
(ii) It is represented by Exactly 3 dots(...)
(iii) It can accept 0 to 'n'  number of parameters of same type OR even different heterogeneous type using Object array.
(iv) A var args is internally an array variable so it can hold multiple values but important thing is, unlike array , It can accept array argument as well as multiple values as an argument .
(v) Var args we can use only with method and constructor parameter.
(vi) Var args must be only one and last parameter for any method Or constructor.
**/
class test {
    public void input (int ...x){
        System.out.println("Executed");
    }
}
public class VarArgsDemo1 {
    public static void main(String[] args) {
        test t1 = new test();
        t1.input();
        t1.input(10);
        t1.input(10,20);
        t1.input(10,20,30);
    }
}
