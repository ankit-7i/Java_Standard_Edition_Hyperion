package com.ankit.java.introduction.literals.characterliterals;

public class CharacterLiteralSize {
    public static void main(String[] args) {
        System.out.println(" Min val : "+(int)Character.MIN_VALUE);
        System.out.println(" Max val : "+(int)Character.MAX_VALUE);

        int min = '\u0000';
        int max = '\uffff';
        System.out.println(" Min Val "+min);
        System.out.println( " Max val "+max);
    }
}
