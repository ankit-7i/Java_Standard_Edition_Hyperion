package com.java.collection_framework.collection;

/**
 * Collections Framework in Java  [40–45% IQ]
 * -----------------------------------------
 * Collections Framework is a Data Structure API in Java.
 * The main purpose of Collections is to reduce time complexity to improve application performance.
 * Collections work with object-based storage (objects are stored and retrieved as objects).
 * In the Collections framework, we deal with two types of objects:
 *   a) Single / Individual Object
 *   b) Group of Objects
 *
 * -------------------------------------------------------------------
 * Single / Individual Object
 * -------------------------------------------------------------------
 * Use Collection<?> interface to work with a single or individual object.
 * Collection is a predefined interface in java.util (since JDK 1.2).
 *
 * Example:
 *   Collection collection = new Vector();
 *   collection.add("ravi@gmail.com");
 *   collection.add("raj@gmail.com");
 *   System.out.println(collection);
 *
 * -------------------------------------------------------------------
 * Group of Objects
 * -------------------------------------------------------------------
 * Use Map<K, V> interface to work with groups of key–value objects.
 * Map<K,V> is a predefined interface in java.util (since JDK 1.2).
 *
 * Example:
 *   Map map = new Hashtable();
 *   map.put("ravi@gmail.com", "ravi1234");
 *   map.put("raj@gmail.com", "raj1234");
 *   System.out.println(map); // Key = Value
 *
 * -------------------------------------------------------------------
 * Story of Collections from JDK 1.0
 * -------------------------------------------------------------------
 * Before Collections API, Vector (in java.util) was used to store objects.
 *
 * Example:
 *   Vector vector = new Vector();
 *   vector.addElement(121);
 *   vector.addElement("Ravi");
 *   vector.addElement(null);
 *   vector.addElement(121);
 *   System.out.println(vector);
 *
 * In early days, Java applications used Vector to store email IDs & passwords,
 * but Vector could not map user and password together.
 *
 *   Vector user = new Vector();
 *   user.add("ravi@gmail.com");
 *   user.add("raj@gmail.com");
 *   user.add("scott@gmail.com");
 *
 *   Vector pwd = new Vector();
 *   pwd.add("ravi12345");
 *   pwd.add("raj12345");
 *   pwd.add("scott@@&^");
 *
 * Problem: No mapping between user & password.
 *
 * -------------------------------------------------------------------
 * Introduction of Hashtable (solution)
 * -------------------------------------------------------------------
 * To store key–value pairs (user → password mapping), Java introduced Hashtable<K,V>,
 * a child class of Dictionary<K,V>, to store group of objects.
 *
 * Example:
 *   Map d = new Hashtable();
 *   d.put("ravi@gmail.com", "ravi123");
 *   d.put("raj@gmail.com", "raj1234");
 *   d.put("scott@gmail.com", "scott1234");
 *
 *   d.remove("raj@gmail.com");
 *
 * Now we can properly map usernames with passwords.
 */
public class CollectionNotes {
    public static void main(String[] args) {
        // Your logic goes here
    }
}
