package com.ankit.java.oops_concept.instance_initializer;

 class NonStaticBlock {

        {
            System.out.println("Non static block");
        }
    }

    public class Demo1 {
        public static void main(String[] args) {
            new NonStaticBlock ();
            new NonStaticBlock ();
            new NonStaticBlock ();
        }
    }

