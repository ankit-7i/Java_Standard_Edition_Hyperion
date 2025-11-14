package com.java.collection_framework.arraylist.comparable_and_comparator;

public class Product  implements Comparable<Product>{
    private  Integer productNumber;
    private String productName;
    private Double productPrice;

    public Product(Integer productNumber,String productName,Double productPrice ) {
        this.productNumber=productNumber;
        this.productName = productName;
        this.productPrice=productPrice;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Product o) {

        return this.productName.compareTo(o.productName);


    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                ", productPrice=" + productPrice +
                '}';
    }
}

/*





 */