
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
// The Main class
public class NewClass {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course(229, "Data Structures and Algorithyms", "CSC229");

        System.out.println("\nCourse 1 Details:");
        displayCourseDetails(course1);
    }

    // A method to display the course details
    public static void displayCourseDetails(Course course) {
        System.out.println("ID: " + course.getId());
        System.out.println("Name: " + course.getName());
        System.out.println("Code: " + course.getCode());
    }
}

