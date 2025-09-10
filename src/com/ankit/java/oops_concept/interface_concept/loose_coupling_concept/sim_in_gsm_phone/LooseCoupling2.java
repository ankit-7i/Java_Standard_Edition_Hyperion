package com.ankit.java.oops_concept.interface_concept.loose_coupling_concept.sim_in_gsm_phone;

import java.util.Scanner;

public class LooseCoupling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Choose your Module ");
        System.out.println("1.Airtel");
        System.out.println("2.Jio");
        System.out.println("3.BSNL");
        System.out.println("4.VI");
        System.out.println("5.Tejas Network");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1 ->{
                GSM_Mobile.Configureandrun(new Airtel());

            }
            case 2 -> {
                GSM_Mobile.Configureandrun(new Jio());

            }
            case 3 ->{
                GSM_Mobile.Configureandrun(new BSNL());
            }
            case 4 -> {
                GSM_Mobile.Configureandrun(new VI());
            }
            case 5-> {
                GSM_Mobile.Configureandrun(new TejasNetwork());
            }
            default -> {
                System.out.println("invalid Choice");
            }
        }


    }
}
