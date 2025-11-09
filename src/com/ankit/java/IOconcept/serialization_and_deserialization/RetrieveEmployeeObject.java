package com.ankit.java.IOconcept.serialization_and_deserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveEmployeeObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var fin = new FileInputStream("C:\\new\\Employee.txt");
        var ois = new ObjectInputStream(fin);

        try (fin; ois) {

            while (true) {
                Employee employee = (Employee) ois.readObject();
                System.out.println(employee);
            }
        }
        catch (EOFException e) {
            System.err.println("End of File has reached!!");
        }
    }
}
