package com.ankit.java.IOconcept;

/**
 * --------------------------------------------------------------------------
 * File Handling :
 * --------------------------------------------------------------------------
 *
 * What is the need of File Handling?
 * ----------------------------------
 * File handling is nothing but creating a file and performing read and write
 * operations on the file.
 *
 * As we know, to store a value in the program, we need to take the support
 * of a variable. Once the execution of the program is completed, all variables
 * and their values are destroyed from the memory (RAM). RAM is volatile,
 * meaning we cannot use its stored values after program execution ends.
 *
 * If we want to store values permanently, we need to store them in files
 * (secondary memory). So in the future we can retrieve those values.
 *
 * To perform read and write operations in files, we use the stream concept.
 *
 *
 * --------------------------------------------------------------------------
 * Working with predefined classes of java.io package :
 * --------------------------------------------------------------------------
 *
 * File Class :
 * ------------
 * File class is a predefined class available in java.io package.
 *
 * The following statement will NOT create any file.
 * If the file is already existing, then it will refer to the existing file:
 *
 *      File file = new File("C:\\new\\abc.txt");
 *
 * It will never create abc.txt file by itself.
 *
 *
 * Methods of File class :
 * -----------------------
 *
 * 1) public boolean exists()
 *    → Returns true if the file exists at the given path.
 *    → Returns false otherwise.
 *
 * 2) public boolean createNewFile() throws IOException
 *    → Creates a new file (if it does not already exist).
 *    → Returns true if file is created.
 *    → Returns false if file already exists.
 *
 * --------------------------------------------------------------------------
 */


import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {

        File file = new File("C:\\new\\hello.txt");

        try {

            if (file.exists()) {
                System.out.println(file.getName() + " is available");
            } else {
                System.err.println(file.getName() + " is not available");
            }

            System.out.println("--------------");

            if (file.createNewFile()) {
                System.out.println(file.getName() + " has been created successfully");
            } else {
                System.err.println(file.getName() + " is already existing");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
