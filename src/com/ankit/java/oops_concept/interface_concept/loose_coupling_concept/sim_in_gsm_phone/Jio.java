package com.ankit.java.oops_concept.interface_concept.loose_coupling_concept.sim_in_gsm_phone;

public class Jio implements SubscriberIdentityModule{
    @Override
    public void usage(){
        System.out.println("Jio Module is Running");
    }
}
