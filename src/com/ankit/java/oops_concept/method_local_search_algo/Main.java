package com.ankit.java.oops_concept.method_local_search_algo;

 class Test {
    static  int x = 100;
    int y = 200;
    public void accept (int a){
        int b = 400;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.accept(300);
    }
}
