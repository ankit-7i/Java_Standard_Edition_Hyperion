package com.ankit.java.array_concept;

public class Note {

    /**
     * ARRAYS IN JAVA
     *
     * What is a Variable in Java?
     * ---------------------------
     * A variable is a name given for the memory location.
     *
     * Drawback of an Ordinary Variable:
     * ---------------------------------
     * An ordinary variable can hold only one value at a time in a random memory location.
     *
     * Example:
     * int a = 90;   // initialized
     * int b = 94;   // initialized
     *
     * In order to avoid the drawback of an ordinary variable, the concept of Array came into the picture.
     *
     * What is an Array?
     * -----------------
     * An array is a container object which holds a fixed number of values in an ordered collection.
     * Arrays are objects, so they are always created inside heap memory.
     *
     * The length of an array is established when the array is created.
     * After creation, its length is fixed.
     *
     * An array is a reference variable; it provides support for both primitive and reference types.
     *
     * Example:
     * --------
     * int[] arr = new int[10];
     * System.out.println(arr[0]);
     *
     * Characteristics of an Array:
     * ----------------------------
     * 1) Homogeneous Elements:
     *    All elements in an array must be of the same data type.
     *    But by using upcasting, we can accept heterogeneous elements as objects.
     *
     * 2) Fixed Size:
     *    Once an array is created, its size cannot be changed.
     *    (There is nothing but a fixed number of elements that can be stored.)
     *
     * 3) Random Access:
     *    We can access the element using index: arr[0] for the first element, arr[1] for the second, etc.
     *    Also, we can find the last index position easily:
     *      size = 10  --> last index = (10 - 1) = 9
     *
     * 4) Stored in Contiguous Memory:
     *    Array elements are stored in adjacent memory locations, improving access speed (cache-friendly).
     *    Arrays in Java are stored in the HEAP memory.
     *
     * 5) Default Values:
     *    When an array is declared but not initialized, Java assigns default values because it is a reference type.
     *    Example: int → 0, float → 0.0, boolean → false, Object → null.
     *
     * 6) Direct Access:
     *    Direct access to elements using an index provides fast data retrieval (O(1) time complexity).
     *
     * 7) Index Numbering:
     *    Array indexing starts from 0.
     *    Example:
     *      1st element → arr[0]
     *      2nd element → arr[1]
     *      nth element → arr[n-1]
     *
     * 8) Memory Representation:
     *    Each element’s memory address is calculated as:
     *      Base Address + (index * size of element)
     *    Example for int (4 bytes):
     *      Base = 1000
     *      arr[0] = 1000
     *      arr[1] = 1004
     *      arr[2] = 1008
     *      arr[3] = 1012
     *
     * Advantages of Arrays:
     * ---------------------
     * 1) Fast access using index.
     * 2) Stores multiple elements of the same type.
     * 3) Reduced memory overhead.
     *
     * Disadvantages of Arrays:
     * ------------------------
     * 1) Fixed size – cannot grow or shrink dynamically.
     * 2) Stores only one type of data.
     * 3) No predefined method support for common operations.
     */

}
