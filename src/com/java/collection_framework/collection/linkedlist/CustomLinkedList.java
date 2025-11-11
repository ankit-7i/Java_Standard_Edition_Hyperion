package com.java.collection_framework.collection.linkedlist;

// Singly LinkedList Example
public class CustomLinkedList {

    // Node class representing each element in the LinkedList
    private static class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node n1 = new Node(100);
        Node n2 = new Node(200);
        Node n3 = new Node(300);

        // Establish the links (connect the nodes)
        n1.next = n2;
        n2.next = n3;

        // Print the LinkedList data
        System.out.println("First Node: " + n1.item);
        System.out.println("Second Node: " + n1.next.item);
        System.out.println("Third Node: " + n1.next.next.item);
    }
}
