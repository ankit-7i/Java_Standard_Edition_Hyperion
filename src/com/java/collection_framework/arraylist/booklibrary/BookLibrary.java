package com.java.collection_framework.arraylist.booklibrary;

import java.util.Scanner;

public class BookLibrary {

    public static void main(String[] args) {
        Library l = new Library();
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to library management ");
        System.out.println("Operations  :");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Update Quantity");
        System.out.println("4. Delete Book");
        System.out.println("5. Exit");

        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scn.nextLine());

        while (true){
            switch (choice){
                case 1 ->{
                    l.addBook();
                }
                case 2 ->{
                    l.displayAllBooks();
                }
                case 3 ->{
                    l.updateBookQuantityByISBN();
                }
                case 4 -> {
                    l.deleteBookByTitle();
                }

                case 5 ->{
                    scn.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice ");
                }
            }
        }



    }

}
