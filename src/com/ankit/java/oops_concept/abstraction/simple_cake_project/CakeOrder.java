package com.ankit.java.oops_concept.abstraction.simple_cake_project;
import java.util.Scanner;
public class CakeOrder {


        public static void main(String[] ankit)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a choice user  :");
            System.out.println("1)Non Customizable  Cake");
            System.out.println("2)Non msg printable cake");
            System.out.println("3)Customizable cake ");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose)
            {
                case 1 ->
                {
                    System.out.println("You Choose Non Customizable Cake");
                    OrderedCake cake1 = new OrderedCake();
                    System.out.println(cake1);
                    System.out.println("Thank you user \uD83D\uDE4F Visit Again ");
                }


                case 2->{

                    System.out.println("You Choose Non msg printable cake ");

                    System.out.print("Enter Shape :");
                    String shape = sc.nextLine();
                    System.out.print("Enter falvor :");
                    String flavor = sc.nextLine();
                    System.out.println("Enter Quantity :");
                    int quantity = Integer.parseInt(sc.nextLine());

                    OrderedCake cake2 = new OrderedCake(shape,flavor,quantity);

                    System.out.println(cake2);
                    System.out.println("Thank you user \uD83D\uDE4F Visit Again ");
                }
                case 3-> {
                    System.out.println("You Choose Customizable cake ");
                    System.out.print("Enter Shape :");
                    String shape = sc.nextLine();
                    System.out.print("Enter falvor :");
                    String flavor = sc.nextLine();
                    System.out.print("Enter Quantity :");
                    int quantity = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter the customizable message you want ");
                    String message = sc.nextLine();

                    OrderedCake cake3 = new OrderedCake(shape,flavor,quantity,message);
                    System.out.println(cake3);
                    System.out.println("Thank you user \uD83D\uDE4F Visit Again ");
                }

                default -> {
                    System.err.println("Invalid choice user");
                }
            }
        }
}
