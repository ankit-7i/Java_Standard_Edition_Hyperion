package com.ankit.java.introduction.literals.characterliterals;

public class UnicodeRepresentation {
    public static void main(String[] args) {
        String hindi = "\u0928\u092E\u0938\u094D\u0924\u0947";
        System.out.println(hindi);
        String odia = "\u0B28\u0B2E\u0B38\u0B4D\u0B15\u0B3E\u0B30";
        System.out.println("\n"+odia);
        String telugu = "\u0C28\u0C2E\u0C38\u0C4D\u0C24\u0C47";
        System.out.println("\n"+telugu);
        String urdu = "\u0633\u0644\u0627\u0645";
        System.out.println("\n"+urdu);

    }
}
