package com.java.collection_framework.arraylist.booklibrary;

import com.java.collection_framework.arraylist.comparable_and_comparator.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {


    private ArrayList<Book> books;

    public Library(){

    }
    private boolean isUniqueISBN(long isbn){
        for(Book b : books ) {
            if (b.getIsbn() == isbn) {
                return false;
            }
        }
        return  true;
    }
    public void addBook(Book book){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of book you want :");
        int noOfBooks = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<noOfBooks;i++) {
            System.out.print("Enter Book title :");
            String titleName = sc.nextLine();
            System.out.print("Enter author  name ");
            String authorName = sc.nextLine();
            System.out.print("Enter ISBN Number");
            long isbn = Long.parseLong(sc.nextLine());
            System.out.print("Enter Book Price");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Enter the Quantity of book: ");
            int qty = Integer.parseInt(sc.nextLine());


            if (isUniqueISBN(isbn)) {
                books.add(new Book(titleName, authorName, isbn, price, qty));
                System.out.println("Book added successfully.\n");
            } else {
                System.out.println("Book with the same ISBN " + isbn + " already exists.\n");
            }


        }
    }

    private Book searchBookByISBN(long isbn){
       Book bb=null;
             for(Book b:books){
                   if(b.getIsbn()==isbn){
                       System.out.println("Book with searched ISBN number is Found");
                       bb=b;
                       break;
                   }
             }
            return bb;
    }

    public void displayAllBooks(){
        for(Book book : books){
            System.out.println(book.displayBook());
        }

    }

    /*
    private void  updateVerification(long isbn){
        for (Book book :books){
            if(book.getIsbn() != isbn){
                System.out.println("ISBN  Not verified ");
                break;
            }

        }




    }
    */

    public void updateBookQuantityByISBN(long isbn){
        /*
         Book book=  searchBookByISBN(isbn);//
        if(book!=null){
            int newqty=10;
            book.setQuantity(newqty);
        }*/
       for(Book book :books){  // [b1,b2]
           if(book.getIsbn() == isbn){
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter ISBN Number to update the Book  Details : ");
               long isBn = Long.parseLong(sc.nextLine());
               System.out.println("Enter the book quantity you want to update :");
               int qty = Integer.parseInt(sc.nextLine());
               if(qty>0){
                   book.setQuantity(qty);
               }
               else {
                   System.out.println("Updation Not possible");
               }


           }
       }


    }

    public void deleteBookByTitle(String title){
        if (title == null || title.isBlank()) {
            System.err.println("Book Title cannot be blank");
            return;
        }
        Iterator<Book> iterator = books.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (title.equals(book.getTitle())) {
                iterator.remove();
                found = true;
                break;
            }
        }


    }


}
