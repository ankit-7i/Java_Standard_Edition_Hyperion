package com.ankit.java.oops_concept.shallow_copy;

public class ElcLaptop2 {

        public static void main(String[] args) {
            Laptop2 lap1 = new Laptop2("DELL", 90000);
            System.out.println(lap1);

            Laptop2 lap2 = lap1;
            System.out.println(lap2);

            System.out.println("Modification by using lap2");

            lap2.setBrand("HP");
            lap2.setPrice(95000);

            System.out.println(lap1);
            System.out.println(lap2);
        }
    }


