package com.ankit.java.object_class_and_its_method.public_boolean_equals;

import java.util.Objects;

public class Product12 {
    private int productId;
    private String productName;

    // Parameterized constructor
    public Product12(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public int hashCode() {
        // Use Objects.hash() to generate a hash code based on all fields
        return Objects.hash(productId, productName);
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is being compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Product and compare fields
        Product12 other = (Product12) obj;
        return this.productId == other.productId &&
                Objects.equals(this.productName, other.productName);
    }
}
