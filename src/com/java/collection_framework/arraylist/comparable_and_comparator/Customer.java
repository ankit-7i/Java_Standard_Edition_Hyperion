package com.java.collection_framework.arraylist.comparable_and_comparator;

public class Customer {
    private Integer customerNumber;
    private String customerName;
    private Double customerBill;

    public Customer(Integer customerNumber, String customerName, Double customerBill) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }


    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerBill=" + customerBill +
                ", CustomerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
