package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation;

/**
 * Aggregation:
 * ------------
 * Aggregation in Java is another form of association between classes that represents
 * a "HAS-A" relationship but with a weaker bond compared to composition.
 *
 * ➤ In aggregation, one class contains an object of another class.
 * ➤ The contained object can exist independently of the container.
 * ➤ If the container object is destroyed, the contained object can still exist.
 */



/**
 * Represents a College entity with a name and location.
 */
public class College {
    private String collegeName;
    private String location;

    /**
     * Parameterized constructor to initialize college details.
     *
     * @param collegeName name of the college
     * @param location    location of the college
     */
    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "College [collegeName = " + collegeName + ", location = " + location + "]";
    }
}
