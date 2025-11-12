package com.java.collection_framework.linkedlist;

import java.util.*;
public class LinkedListDemo4 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLinked List: " + linkedList);
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int elementToAdd = Integer.parseInt(scanner.nextLine());
                    linkedList.add(elementToAdd);
                    break;

                case 2:
                    if (linkedList.isEmpty()) {
                        System.out.println("Linked list is empty. Nothing to delete.");
                    } else {
                        System.out.print("Enter the element to delete: ");
                        int elementToDelete = Integer.parseInt(scanner.nextLine());
                        boolean removed = linkedList.remove(Integer.valueOf(elementToDelete));
                        if (removed)
                            System.out.println(elementToDelete + " is deleted successfully!");
                        else
                            System.out.println(elementToDelete + " is not available in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Elements in the linked list:");
                    linkedList.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
