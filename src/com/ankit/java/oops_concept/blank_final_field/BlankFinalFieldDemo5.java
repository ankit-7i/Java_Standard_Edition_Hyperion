package com.ankit.java.oops_concept.blank_final_field;

// Example: A blank final field must be initialized in ALL constructors of the class.
// If even one constructor does not initialize it, the compiler will throw an error.


class Student {
    private final String jobTitle; // Blank final field

    // Constructor 1: Assigns a default job title
    public Student() {
        jobTitle = "IT Developer"; // Initialization required
    }

    // Constructor 2: Allows setting a custom job title
    public Student(String jobTitle) {
        this.jobTitle = jobTitle; // Initialization required
    }

    // Getter method to retrieve the job title
    public String getJobTitle() {
        return jobTitle;
    }
}

public class BlankFinalFieldDemo5 {
    public static void main(String[] args) {
        // Using default constructor
        Student raj = new Student();
        System.out.println("He is an " + raj.getJobTitle()); // Output: He is an IT Developer

        // Using parameterized constructor
        Student rahul = new Student("Software Engineer");
        System.out.println("He is a " + rahul.getJobTitle()); // Output: He is a Software Engineer
    }
}

