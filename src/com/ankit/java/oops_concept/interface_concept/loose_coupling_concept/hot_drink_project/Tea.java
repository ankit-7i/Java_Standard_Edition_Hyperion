package com.ankit.java.oops_concept.interface_concept.loose_coupling_concept.hot_drink_project;

public class Tea implements HotDrink{
    @Override
    public void prepare() {
        System.out.println("Preparing Irani Tea!!!");
    }
}
