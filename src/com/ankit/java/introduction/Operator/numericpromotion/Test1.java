package com.ankit.java.introduction.Operator.numericpromotion;
// Unary minus operator
/*
        Whenever we are performing any opearation on 2  or more than 2 differnent data types then automatically the result will prompted to bigger data type

        While working with Arithmetic operator and Unary minus operator,the result is promoted to int type , that means in order to hold the result we need min 32 bits of data so we should not have any data loss
 */
public class Test1 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(-x);
    }
}

