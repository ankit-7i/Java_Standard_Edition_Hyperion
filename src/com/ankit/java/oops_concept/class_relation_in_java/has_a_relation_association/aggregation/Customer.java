package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation;

public class Customer {
    private String name;
    private String email;
    private String address;
    private long mobileNo;
    private Order order;
    public Customer(String name, String email, String address, long mobileNo, Order order) {
        super();
        this.name = name;
        this.email = email;
        this.address = address;
        if(mobileNo <=0) {
            System.out.println("Error: Invalid Input");
            System.exit(0);
        }
        this.mobileNo = mobileNo;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobileNo=" + mobileNo
                + ", order=" + order + "]";
    }



}

