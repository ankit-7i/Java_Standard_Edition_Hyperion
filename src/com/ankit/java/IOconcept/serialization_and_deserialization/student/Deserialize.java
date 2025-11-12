package com.ankit.java.IOconcept.serialization_and_deserialization.student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        var fin = new FileInputStream("C:\\Users\\ankit\\OneDrive\\Attachments\\Documents\\Desktop\\Serialization_and_Deserialization\\Student.txt.txt");
        var ois = new ObjectInputStream(fin);
        try(fin;ois) {
            while (true){
                Student st = (Student) ois.readObject();
                System.out.println(st);
            }
        }
        catch (EOFException e){
            System.err.println("End of file reached > Terminated");
        }
    }
}
