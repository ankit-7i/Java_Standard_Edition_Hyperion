package com.ankit.java.oops_concept.factory_method;

public class ElcBook {

        public static void main(String[] args) {
            Book b1 = Book.getBookObject();
            System.out.println(b1);
        }
}


/*
*In the above program, with the help of getBookObject() we are getting only one type of object which is having same properties. On the other hand we know that Methods are mainly used for Re-usability purpose.
* */