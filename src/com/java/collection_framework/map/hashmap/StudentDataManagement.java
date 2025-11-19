package com.java.collection_framework.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDataManagement {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ Student Management Menu ------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Marks");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Show Topper");
            System.out.println("7. Show Lowest Scorer");
            System.out.println("8. Show Total and Average Marks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String addName = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    students.put(addName, marks);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student name to update the marks : ");
                    String upName = sc.nextLine();

                    if (students.containsKey(upName)) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();
                        students.put(upName, newMarks);
                        System.out.println("Marks updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to delete: ");
                    String delName = sc.nextLine();

                    if (students.containsKey(delName)) {
                        students.remove(delName);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();

                    if (students.containsKey(searchName)) {
                        System.out.println(searchName + " scored " + students.get(searchName));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("---- Student Records ----");
                    for (Map.Entry<String, Integer> entry : students.entrySet()) {
                        System.out.println(entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 6:
                    if (students.isEmpty()) {
                        System.out.println("No student data available.");
                    } else {
                        String topper = null;
                        int maxMarks = Integer.MIN_VALUE;

                        for (String name : students.keySet()) {
                            if (students.get(name) > maxMarks) {
                                maxMarks = students.get(name);
                                topper = name;
                            }
                        }
                        System.out.println("Topper: " + topper + " => " + maxMarks);
                    }
                    break;

                case 7:
                    if (students.isEmpty()) {
                        System.out.println("No student data available.");
                    } else {
                        String lowest = null;
                        int minMarks = Integer.MAX_VALUE;

                        for (String name : students.keySet()) {
                            if (students.get(name) < minMarks) {
                                minMarks = students.get(name);
                                lowest = name;
                            }
                        }
                        System.out.println("Lowest Scorer: " + lowest + " => " + minMarks);
                    }
                    break;

                case 8:
                    if (students.isEmpty()) {
                        System.out.println("No student data available.");
                    } else {
                        int total = 0;
                        for (int m : students.values()) total += m;

                        double avg = (double) total / students.size();

                        System.out.println("Total Marks: " + total);
                        System.out.println("Average Marks: " + avg);
                    }
                    break;

                case 9:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
