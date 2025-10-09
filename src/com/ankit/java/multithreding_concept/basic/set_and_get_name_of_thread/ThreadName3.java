package com.ankit.java.multithreding_concept.basic.set_and_get_name_of_thread;

/**
 * Program Name: BatchAssignment using Thread Name
 * Description: Demonstrates how to assign different tasks (Placement or Regular batch)
 *              based on the name of the thread.
 * Author: Ankit Rout
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The BatchAssignment class extends the Thread class.
 * It defines behavior for different batch types based on the thread name.
 */
class BatchAssignment extends Thread {

    /**
     * The run() method is executed when the thread starts.
     * It checks the name of the thread and calls the corresponding method
     * (placementBatch() or regularBatch()) based on the batch type.
     */
    @Override
    public void run() {
        // Get the current thread's name and convert it to lowercase
        String name = Thread.currentThread().getName().toLowerCase();

        // Check for "placement" batch
        if (name != null && name.equals("placement")) {
            this.placementBatch();
        }
        // Check for "regular" batch
        else if (name != null && name.equals("regular")) {
            this.regularBatch();
        }
    }

    /**
     * Displays a message for placement batch students.
     */
    public void placementBatch() {
        System.out.println("I am a placement batch student.");
    }

    /**
     * Displays a message for regular batch students.
     */
    public void regularBatch() {
        System.out.println("I am a regular batch student.");
    }
}

/**
 * The ThreadName3 class contains the main() method.
 * It allows the user to input a batch title (Placement/Regular),
 * sets that as the thread name, and starts the thread.
 */
public class ThreadName3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.print("Enter your Batch Title [Placement/Regular]: ");
            String title = sc.next();

            // Create a new thread and assign its name based on user input
            BatchAssignment b = new BatchAssignment();
            b.setName(title);

            // Start the thread
            b.start();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}

