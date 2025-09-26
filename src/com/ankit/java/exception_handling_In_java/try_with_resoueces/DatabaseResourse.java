package com.ankit.java.exception_handling_In_java.try_with_resoueces;


// Second resource class implementing AutoCloseable
public class DatabaseResourse implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Database Resourse closed successfully!!!");
    }
}

