package com.ankit.java.IOconcept.serialization_and_deserialization.student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Serialize {
    public static void main(String[] args) throws IOException {
        ArrayList<Student>  al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        var fout = new FileOutputStream("C:\\Users\\ankit\\OneDrive\\Attachments\\Documents\\Desktop\\Serialization_and_Deserialization\\Student.txt");
        var oos = new ObjectOutputStream(fout);

        try(sc;fout;oos){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of Student to store: ");
            int count = scanner.nextInt();
            for(int i=1;i<=count;i++){
                Student st = Student.getStudentObject();
                al.add(st);

            }
            for(Student s:al){
                oos.writeObject(s);
            }
            System.out.println("Success : Student details stored ");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
