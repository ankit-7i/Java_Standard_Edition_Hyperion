package com.ankit.java.oops_concept.shallow_copy;

public class Laptop2 {

        private String brand;
        private double price;

        public Laptop2(String brand, double price) {
            super();
            this.brand = brand;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Laptop [brand= " + brand + ", price= " + price + "]";
        }
}


