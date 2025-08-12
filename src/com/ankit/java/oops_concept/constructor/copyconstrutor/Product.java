package com.ankit.java.oops_concept.constructor.copyconstrutor;

public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        super();
        this.productId = productId;
        this.productName = productName;
    }

    // Copy constructor
    public Product(Product prod) {  // prod = p1
        this.productId = prod.productId;
        this.productName = prod.productName;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + "]";
    }
}
