package com.ankit.java.IOconcept.serialization_and_deserialization.student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ArrayList<Student> desl = new ArrayList<>();

        var fin = new FileInputStream("C:\\Users\\ankit\\OneDrive\\Attachments\\Documents\\Desktop\\Serialization_and_Deserialization\\Student.txt");
        var ois = new ObjectInputStream(fin);
        try(fin;ois) {
            while (true){
                Student st = (Student) ois.readObject();
                desl.add(st);
            }
        }
        catch (EOFException e){
            System.err.println("End of file reached > Terminated");
        }
        System.out.println("Deserialized Student List:");
        for (Student s : desl) {
            System.out.println(s);
        }

    }
}
