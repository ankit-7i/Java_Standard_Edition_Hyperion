package com.java.collection_framework;

/**
 * Collections Framework from JDK 1.2v
 * -----------------------------------
 * * JDK 1.2 is very popular for collection enhancement.
 * * Oracle (formerly Sun) provided Reverse Engineering and re-structured Collections from scratch.
 * * Java introduced the Layered Architecture in Collections with 2 major interfaces:
 *      1) Collection
 *      2) Map
 *
 * Layered Architecture
 * --------------------
 * * It is a technique to store the classes and interfaces in a way that modification becomes easy.
 * * Java introduced 3 layers:
 *
 *   Layer-1 : Only Interfaces   (FULL ABSTRACTION)
 *   Layer-2 : Only Abstract Classes (PARTIAL ABSTRACTION)
 *   Layer-3 : Concrete classes (NO ABSTRACTION, ONLY IMPLEMENTATION)
 *
 *
 * Collection Hierarchy
 * ---------------------
 * java.lang.Iterable<T>  [1.5]
 *    |
 *    +-- Collection<T> [1.2]
 *           |
 *           +-- List<T>   [1.2]
 *           +-- Set<T>    [1.2]
 *           +-- Queue<T>  [1.5]
 *
 *
 * Useful APIs on Iterable
 * -----------------------
 * * Iterator()      [1.2]  -> Forward only
 * * ListIterator()  [1.2]  -> Forward + Backward
 * * forEach loop    [1.5]
 * * forEach(Consumer<? super T>) [1.8]
 * * spliterator()   [1.8]
 *
 *
 * Collection
 * ----------
 * * Predefined interface in java.util (from JDK 1.2)
 * * It is the root interface for all Collection classes.
 * * Extends java.lang.Iterable interface.
 *
 *
 * List
 * ----
 * * Predefined interface (JDK 1.2)
 * * Child of Collection
 * * Allows duplicate elements
 * * Maintains insertion order
 * * Internally implementations use ARRAY based storage concept
 *
 *
 * Set
 * ---
 * * Predefined interface (JDK 1.2)
 * * Child of Collection
 * * Does NOT allow duplicate elements
 * * Does NOT guarantee indexing or order
 * * Uses Hashing techniques
 *
 *
 * Queue
 * -----
 * * Predefined interface (JDK 1.5)
 * * Follows FIFO (First In First Out)
 *
 *
 * Iterable
 * --------
 * * Predefined interface (java.lang)
 * * Introduced in JDK 1.5
 * * Contains methods to retrieve objects from collection
 *
 *
 * Iterator
 * --------
 * * Predefined interface in java.util (JDK 1.2)
 * * Used to retrieve elements in forward direction only
 *
 *
 * ListIterator
 * ------------
 * * Predefined interface in java.util (JDK 1.2)
 * * Used to retrieve collection elements in forward + backward direction
 * * Extends Iterator
 *
 *
 * Collections (Utility Class)
 * ---------------------------
 * * Predefined utility class in java.util (JDK 1.2)
 * * Contains only static methods
 * * Constructor is private
 * * Used for manipulating collections (sort, reverse, shuffle, etc.)
 */
public class CollectionsNotes2 {
    public static void main(String[] args) {
        // code samples here
    }
}

