package com.ankit.java.oops_concept.factory_method;
import java.util.Scanner;

public class ElcProduct {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of product objects: ");
            int noOfObj = sc.nextInt();

            for (int i = 1; i <= noOfObj; i++) {
                Product product = Product.getProductObject();
                System.out.println(product);
            }

            sc.close();
        }
    }


