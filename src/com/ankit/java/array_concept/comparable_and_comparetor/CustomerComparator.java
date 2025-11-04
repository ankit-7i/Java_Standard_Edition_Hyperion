package com.ankit.java.array_concept.comparable_and_comparetor;



import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

record Customer (Integer id,String name,Double bill) {

}
public class CustomerComparator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.print("Enter the size: ");
            int size = Integer.parseInt(sc.nextLine());

            Customer[] cust = new Customer[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter Customer Id: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Customer Name: ");
                String name = sc.nextLine();

                System.out.println("Enter bill Amount: ");
                double bill = Double.parseDouble(sc.nextLine());

                cust[i] = new Customer(id, name,bill);
            }


            System.out.println("  1) By using Customer id");
            System.out.println("  2) By using Customer name");
            System.out.println("   3) By using Customer bill ");

            System.out.println("Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());


            switch (choice) {
                case 1 ->{
                    Arrays.sort(cust, (p1, p2) -> p1.id()-p2.id());
                    System.out.println("\nSorted based on the id:");
                    System.out.println(Arrays.toString(cust));
                }
                case 2->{
                    Arrays.sort(cust, (p1, p2) -> p1.name().compareTo(p2.name()));
                    System.out.println("\nSorted based on the name:");
                    System.out.println(Arrays.toString(cust));
                }
                case 3 ->{
                    Arrays.sort(cust, (p1, p2) -> Double.compare(p1.bill(), p2.bill()));
                    System.out.println("\nSorted based on the bill amount:");
                    System.out.println(Arrays.toString(cust));
                }
                default->{
                    System.out.println("Invalid choice ");

                }

            }
        }


    }
}

