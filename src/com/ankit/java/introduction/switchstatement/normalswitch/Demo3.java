package com.ankit.java.introduction.switchstatement.normalswitch;

public class Demo3 {
    public static void main(String[] args) {
        int x =10;
        final int y = 12;
        switch(x){
            case y -> System.out.println("It is case 12");
        }
    }
}
// We can't pass long, float, and double and boolean value
