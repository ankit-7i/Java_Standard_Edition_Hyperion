package com.ankit.java.oops_concept.factory_method;

public class Book {

        private String title;
        private String author;
        private double price;

        private Book(String title, String author, double price) {
            super();
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // static factory design pattern
        public static Book getBookObject() {
            return new Book("Java", "James Gosling", 1500);
        }

        public String toString() {
            return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
        }
    }
