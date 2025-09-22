package com.ankit.java.oops_concept.interface_concept.functional_interface.suplier;

import java.util.Random;
import java.util.function.Supplier;
public class PasswordGenerator
{
    public static void main(String[] args)
    {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "@#$%!&*";

        String mixedCar = upper+ lower+ digits +special;
        Random rr = new Random();
        Supplier<String> pwdSupplier = () ->
        {
            String password = "";

            for(int i=0; i<8; i++)
            {
                int index = rr.nextInt(mixedCar.length()); //index = 68
                password = password + mixedCar.charAt(index); //password -> EJ
            }
            return password;
        };
        String passwd = pwdSupplier.get();
        System.out.println("Generated Password is :"+passwd);
    }
}
