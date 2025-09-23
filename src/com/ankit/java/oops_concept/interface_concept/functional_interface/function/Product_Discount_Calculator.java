package com.ankit.java.oops_concept.interface_concept.functional_interface.function;


import java.util.Scanner;
import java.util.function.*;


public class Product_Discount_Calculator

{
    public static void main(String []  ankit)

    {

        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.next());
        String name  =  sc.next();
        double price = Double.parseDouble(sc.next());
        if (price <= 0){
            System.out.println("Invalid Price");
            System.exit(0);
        }

        Product product = new Product(id,name,price);

        Function<Product,Double> disc = pr ->{

            if (pr.price() >= 5000)
            {
                return pr.price()*0.10;
            }
            else
            {
                return pr.price()*0.05;
            }

        };

        double discount = disc.apply(product);
        double finalPrice = product.price()-discount;

        System.out.println("Final price of the product is :" + finalPrice);


    }
}






record Product (int pid,String pname,double price){

}
