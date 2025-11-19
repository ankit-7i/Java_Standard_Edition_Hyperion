package com.java.collection_framework.arraylist.booklibrary;

public class Book {
    private String title;
    private String author;
    private long isbn;
    private double price;
    private int quantity;

    public Book(String title,String author,long isbn,double price,int quantity) {
        this.title=title;
        this.author = author;
        this.isbn= isbn;
        this.price= price;
        this.quantity= quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String displayBook(){

        return toString();
    }


}
