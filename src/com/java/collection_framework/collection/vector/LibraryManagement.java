package com.java.collection_framework.collection.vector;



import java.util.Scanner;
import java.util.Vector;
record Book(Integer id,String title,String author) {

}
class Library {


    public void displayAvailableBooks(Vector<Book> books) {
        System.out.println("Available Books in the Library:");
        for (Book book : books) {
            System.out.println("  " + book);
        }

    }

    public void issueBooks(Vector<Book>books,Scanner sc)
    {
        System.out.print("Welcome to Book issue Section ");
        System.out.print("Enter Book Id for issuing ");
        int id = Integer.parseInt(sc.nextLine());
        boolean isfound=false;
        for (Book book : books) {
            if(book.id()==id)
            {
                isfound=true;
                System.out.println("Found"+book);

                books.remove(book);
                break;
            }
            else {
                if(isfound) {
                    System.out.println("Book Not Available For Requested Id");
                }
            }

        }



    }

    public void searchBook(Vector<Book>books,Scanner sc) {
        System.out.print("Enter book title for search :");
        String title =  sc.nextLine();
        System.out.print("Enter Author name for search");
        String author = sc.nextLine();

        boolean flag = false;

        for (Book book : books) {
            if (book.title().equalsIgnoreCase(title)|| book.author().equalsIgnoreCase(author)) {
                flag = true;
                System.out.println("Book Found :"+book);
                break;
            }
            else{

                System.out.println("No matching books found.");
                break;
            }

        }



    }

}



public class LibraryManagement {

    public static void main(String[] args) {
        Vector<Book> book = new Vector<>();
        book.add(new Book (1,"Story","Ankit"));
        book.add(new Book(2,"Java","RabiSir"));
        book.add(new Book(3,"C","KishoreSir"));
        book.add(new Book(4,"AdvJava","KishanSir"));
        book.add(new Book(5,"Spring and SpringBoot","NatrajSir"));


        Library l = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from the Menu : ");
        System.out.println("1) Display Books Available in the Library :");
        System.out.println("2) Issue a Book from the Library :");
        System.out.println("3)Search a Book in the Library :");
        System.out.println("4) Exit from the application :");
        while(true) {
            System.out.println("Please Enter your Choice :");

            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1 ->{
                    l = new Library();
                    l.displayAvailableBooks(book);
                }

                case 2 ->{
                    l = new Library();
                    l.issueBooks(book, sc);
                }

                case 3 ->{
                    l = new Library();
                    l.searchBook(book, sc);

                }
                case 4->{
                    System.exit(0);
                }
                default ->{
                    System.out.println("Invalid choice ");

                }
            }

        }


    }

}
