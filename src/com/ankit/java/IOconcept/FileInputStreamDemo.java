package com.ankit.java.IOconcept;

/**
 * --------------------------------------------------------------------------
 * FileInputStream :
 * --------------------------------------------------------------------------
 *
 * - It is a predefined class available in java.io package.
 *
 * - It is used to read the data from an existing file.
 *
 * - In order to read data from an existing file, we can use the predefined method:
 *
 *          public int read()
 *
 * - read() is used to read data from the source character-by-character.
 *
 * - It returns the UNICODE/ASCII value of the character.
 *   → That is the reason the return type of read() is int.
 *     Example: 'A' → 65
 *
 * - If no more data is available in the source, then it will return -1.
 *
 * - Returning -1 indicates EOF (End Of File).
 *
 * --------------------------------------------------------------------------
 */



import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        var fin = new FileInputStream("C:\\new\\hyd.txt");

        try (fin) {

            int i;

            while (true) {

                i = fin.read();   // reading each byte

                if (i == -1)      // check for EOF
                    break;

                System.out.print((char) i);  // converting ASCII value to character
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
