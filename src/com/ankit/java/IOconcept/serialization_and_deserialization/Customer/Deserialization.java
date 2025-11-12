package com.ankit.java.IOconcept.serialization_and_deserialization.Customer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ankit\\OneDrive\\Attachments\\Documents\\Desktop\\Serialization_and_Deserialization\\CustomerObject.txt.txt"))) {
            System.out.println("Customer data retrieved from file:\n");
            while (true) {
                Customer customer = (Customer) ois.readObject();
                System.out.println(customer);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached or error occurred.");
        }
    }
}