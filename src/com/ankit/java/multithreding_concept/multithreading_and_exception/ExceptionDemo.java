package com.ankit.java.multithreding_concept.multithreading_and_exception;

/**
 * Demonstrates exception handling and multithreading behavior in Java.
 *
 * <p>This program shows that even if the main thread is interrupted due to an
 * ArithmeticException (AE), the child threads continue to execute independently.
 * This happens because each thread runs with its own stack.
 */
class Foo extends Thread {

    /**
     * The run() method defines the task performed by the thread.
     * It prints the current thread name to indicate that it is running.
     */
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " thread is running...");
    }
}

/**
 * The ExceptionDemo class contains the main method that initiates
 * multiple threads and demonstrates that exceptions in the main
 * thread do not affect child threads.
 */
public class ExceptionDemo {

    /**
     * The main() method starts two child threads and then throws
     * an ArithmeticException to show that the main thread stops,
     * but the child threads continue execution.
     *
     * @param args Command-line arguments (not used here)
     */
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " thread is running!!!!!");

        Foo f1 = new Foo();
        f1.start();

        Foo f2 = new Foo();
        f2.start();

        // This line will throw an ArithmeticException (division by zero)
        System.out.println(10 / 0);

        System.out.println(name + " thread completed");
    }
}

/**
 * NOTE:
 * The main thread is interrupted due to an ArithmeticException (AE),
 * but the child threads still execute because they operate with
 * separate stacks and run independently.
 */
