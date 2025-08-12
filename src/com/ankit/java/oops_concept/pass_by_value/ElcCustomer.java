package com.ankit.java.oops_concept.pass_by_value;

public class ElcCustomer {

        public static void main(String[] args) {
            Customer c1 = new Customer();
            System.out.println("Current Balance is: " + c1.getBalance());

            updateBalance(c1);

            System.out.println("Balance after Update: " + c1.getBalance());
        }

        public static void updateBalance(Customer cust) {
            cust.setBalance(18000);
        }
    }

/* Even though Java is strictly pass-by-value, when we pass an object reference, a copy of the reference is passed. That means both c1 and cust in the method point to the same object in memory. So changes through cust are visible through c1 as well — a behavior similar to shallow copy.*/
