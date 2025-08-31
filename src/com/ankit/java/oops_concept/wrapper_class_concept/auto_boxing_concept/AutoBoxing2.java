package com.ankit.java.oops_concept.wrapper_class_concept.auto_boxing_concept;

public class AutoBoxing2 {
    public static void main(String[] args) {
        byte b = 12;
        Byte b1 = Byte.valueOf(b);
        System.out.println("Byte Object: " + b1);

        short s = 17;
        Short s1 = Short.valueOf(s);
        System.out.println("Short Object: " + s1);

        int i = 90;
        Integer i1 = Integer.valueOf(i);
        System.out.println("Integer Object: " + i1);

        long g = 12;
        Long h = Long.valueOf(g);
        System.out.println("Long Object: " + h);

        float f1 = 2.4f;
        Float f2 = Float.valueOf(f1);
        System.out.println("Float Object: " + f2);

        double k = 90.90;
        Double l = Double.valueOf(k);
        System.out.println("Double Object: " + l);

        char ch = 'A';
        Character ch1 = Character.valueOf(ch);
        System.out.println("Character Object: " + ch1);

        boolean x = true;
        Boolean x1 = Boolean.valueOf(x);
        System.out.println("Boolean Object: " + x1);
    }
}

