package com.ankit.java.exception_handling_In_java.try_with_resoueces;

import java.io.Closeable;
import java.io.IOException;

// First resource class implementing Closeable
public class FileResourse implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("File Resourse closed!!!!");
    }
}

