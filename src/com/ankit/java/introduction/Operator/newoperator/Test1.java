package com.ankit.java.introduction.Operator.newoperator;
 class Hi {
    int x =100;
    public void greet(){
        System.out.println("Hi ");

    }
    public class Test1 {
        public static void main(String[] args) {
            Hi h = new Hi();
            System.out.println(h.x);
            h.greet();
        }
    }
}
