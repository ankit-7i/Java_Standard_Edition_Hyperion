package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class Print_Integer_and_Character {

    public void Int_to_Char(int n,char c) {
        char convertIntToChar = (char)n;
        System.out.println(" int ="+n);
        System.out.println(("Char ="+(convertIntToChar)));



    }
    public void Char_to_int(char c ,int n)
    {
        int convertCharaToInt = (int)c;
        System.out.println("Char = "+c);
        System.out.println(" int = "+convertCharaToInt);
    }

    public static void main(String[] args) {
        Print_Integer_and_Character fr = new  Print_Integer_and_Character();
        fr.Char_to_int('D', 45);
        fr.Int_to_Char(65, 'B');
    }

}


