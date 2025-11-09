package com.ankit.java.IOconcept;

/**
 * --------------------------------------------------------------------------
 * File class has limitations :
 * --------------------------------------------------------------------------
 *
 * a) Need to call the method to create a new file.
 * b) Cannot create a file automatically if it is already existing.
 *
 *
 * --------------------------------------------------------------------------
 * FileOutputStream :
 * --------------------------------------------------------------------------
 *
 * - It is a predefined class available in java.io package.
 *
 * - It will automatically create a file.
 *      Example: new FileOutputStream("C:\\new\\hyd.txt");
 *   → If the file is already available, it will REPLACE the existing file.
 *
 * - It uses a binary stream to store the data which we write.
 *   → Therefore, data must be converted into binary (byte[]) format.
 *
 * - To write data into a file, FileOutputStream provides the method:
 *
 *         public void write(byte[] bytes)
 *
 *
 * --------------------------------------------------------------------------
 * Program to show how to convert a String into binary :
 * --------------------------------------------------------------------------
 *
 * void main()
 * {
 *      String str = "ABCD";
 *
 *      //Convert the character into binary
 *      byte[] bytes = str.getBytes();
 *
 *      for(byte b : bytes)
 *      {
 *           System.out.println(b);
 *      }
 * }
 *
 *
 * --------------------------------------------------------------------------
 * Program to show how to create a file and write data into the file :
 * --------------------------------------------------------------------------
 */



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException {

        // Creating the file (auto creation)
        var fout = new FileOutputStream("C:\\new\\hyd.txt");

        try {
            String data = "Hyderabad is a nice city, It is an IT & Biryani city";
            byte[] b = data.getBytes();  // converting string into binary

            fout.write(b);   // writing binary data into file

            System.out.println("Data stored successfully");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}

