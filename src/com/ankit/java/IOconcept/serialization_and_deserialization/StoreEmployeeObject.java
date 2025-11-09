package com.ankit.java.IOconcept.serialization_and_deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreEmployeeObject {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        var fout = new FileOutputStream("C:\\new\\Employee.txt");
        var oos = new ObjectOutputStream(fout);

        try (sc; fout; oos) {

            System.out.print("How many Employee Objects ? ");
            int noOfObj = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= noOfObj; i++) {
                Employee employee = Employee.getEmployeeObject();
                oos.writeObject(employee);
            }

            System.out.println("Object stored successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
