package com.ankit.java.introduction.blcelcconcept.blc;

public class ConditionCalculation {
    public static int getSquareAndCube(int num) {
        if (num <= 0) {
            return -1;
        } else if (num % 2 == 0) {
            return num * num;
        } else if (num % 2 == 1) {
            return num * num * num;
        }
        else{
            return -1;
        }
    }
}
