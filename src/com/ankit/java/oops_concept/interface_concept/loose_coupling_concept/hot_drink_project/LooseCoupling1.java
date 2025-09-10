package com.ankit.java.oops_concept.interface_concept.loose_coupling_concept.hot_drink_project;

public class LooseCoupling1
{
    public static void main(String[] args)
    {
        HotDrinkShop.acceptAndPrepare(new Tea());
        HotDrinkShop.acceptAndPrepare(new Coffee());
        HotDrinkShop.acceptAndPrepare(new Boost());
    }
}
