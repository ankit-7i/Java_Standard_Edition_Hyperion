package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;



public class DataTypePrint {

    public void printData(byte age) {
        System.out.println("User's age : "+age);
    }

    public void printData(short weight) {
        System.out.println("User's Weight : "+weight);

    }

    public void printData(int userId) {
        System.out.println("User's UserId : "+userId);

    }
    public void printData(long mobileNo) {
        System.out.println("User's MobileNo : "+mobileNo);

    }
    public void printData(float height) {
        System.out.println("User's Height : "+height);

    }
    public void printData(double accountBalance) {
        System.out.println("User's Account Balance : "+accountBalance);

    }
    public void printData(char gender) {
        System.out.println("User's Gender : "+gender);

    }
    public void printData(boolean isFine) {
        System.out.println("User's health Condition is Good : "+isFine);

    }
    public void printData(String userName) {
        System.out.println("User Name : "+userName);

    }


}

