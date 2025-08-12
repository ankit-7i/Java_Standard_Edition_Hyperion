package com.ankit.java.introduction.Operator.booleanopearator;

public class Test1 {
    public static void main(String[] args) {
        int z = 5;
        if(++z > 5 || ++z > 6)// Logical OR
        {
            z++;
        }
        System.out.println(z);
        System.out.println("............");
        z =5;
        if(++z>5|++z>6)// Boolean OR
        {
            z++;

        }
        System.out.println(z);
    }
}
