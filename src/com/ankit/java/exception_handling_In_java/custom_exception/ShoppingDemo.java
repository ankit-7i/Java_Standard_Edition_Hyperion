package com.ankit.java.exception_handling_In_java.custom_exception;

import java.util.ArrayList;
import java.util.List;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

// Product class
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity)
            throws InvalidPriceException, InvalidQuantityException {
        if (price <= 0) {
            throw new InvalidPriceException("Price must be positive.");
        }
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be positive.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws InvalidQuantityException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be positive.");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s (Price: %.2f, Quantity: %d)", name, price, quantity);
    }
}



class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) throws ProductNotFoundException {
        boolean removed = products.removeIf(p -> p.getName().equals(productName));
        if (!removed) {
            throw new ProductNotFoundException("Product '" + productName + "' not found in cart.");
        }
    }

    public double calculateTotal() {
        return products.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            products.forEach(System.out::println);
            System.out.printf("Total: %.2f%n", calculateTotal());
        }
    }
}

// Main class
public class ShoppingDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            Product laptop = new Product("Laptop", 999.99, 1);
            Product mouse = new Product("Mouse", 19.99, 2);
            cart.addProduct(laptop);
            cart.addProduct(mouse);
            cart.displayCart();

            cart.removeProduct("Mouse");
            cart.displayCart();

            // Uncomment to test exceptions
            // Product invalid = new Product("Invalid", -10.0, 1);
            // cart.removeProduct("Non-existent");
        } catch (InvalidPriceException | InvalidQuantityException | ProductNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
