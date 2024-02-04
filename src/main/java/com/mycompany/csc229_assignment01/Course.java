/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    // These are the data members
    private int id;
    private String name;
    private String code;

    // The default constructor
    public Course() {
        // Initializes the default values
        this.id = 0;
        this.name = "Unknown";
        this.code = "0000";
    }

    //The OVERLOADED constructor
    public Course(int id, String name, String code) {
        // Initializes with provided values
        this.id = id;
        this.name = name;
        this.code = code;
    }

    //getter and setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

