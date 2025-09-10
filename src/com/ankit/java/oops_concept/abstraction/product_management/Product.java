package com.ankit.java.oops_concept.abstraction.product_management;

abstract class Product {
    private String name;
    private double price;
    private String category;




    public Product(String name, double price, String category) {
        super();
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Product name cannot be empty or null.");
            System.exit(0);
        }
        this.name = name;
        if (price < 0) {
            System.err.println("Price cannot be negative.");
            System.exit(0);
        }
        this.price = price;
        if (category == null || category.trim().isEmpty())
        {
            System.err.println("Category cannot be empty or null.");
            System.exit(0);
        }
        this.category = category;
    }

    public abstract void applyDiscount(double percentage);

    public abstract double calculateTax();

    public void setName(String name) {

        this.name = name;
    }


    public void setPrice(double price) {

        this.price = price;
    }

    public void setCategory(String category) {

        this.category = category;
    }



    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + "\nCategory: " + category + "\nPrice RS:" + price;
    }
}


