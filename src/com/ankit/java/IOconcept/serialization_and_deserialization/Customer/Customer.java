package com.ankit.java.IOconcept.serialization_and_deserialization.Customer;

import java.io.Serializable;
import java.util.Scanner;
public class Customer implements Serializable {

    private static final long serialVersionUID = 2L;

    private Integer customerId;
    private String customerName;
    private Double customerBill;

    public Customer(Integer customerId ,String customerName,Double customerBill) {
        this.customerId = customerId;
        this.customerName=customerName;
        this.customerBill= customerBill;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(Double customerBill) {
        this.customerBill = customerBill;
    }

    public static Customer getCustomerObject(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID");
        Integer id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Customer Name ");
        String name = sc.nextLine();
        System.out.println("Enter Customer Bill ");
        Double bill = Double.parseDouble(sc.nextLine());

        return new Customer(id,name,bill);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBill=" + customerBill +
                '}';
    }
}

