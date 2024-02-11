package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person { // ToDo 1: Make this class a child of Person

    private double GPA; // ToDo 3: Add a field for GPA

    public Student(String name, short age) { // Constructor
        super(name, age); // Calls the constructor of the superclass
    }

    public double getGPA(){ // ToDo 3: Getter for GPA
        return GPA;
    }

    public void setGPA(double GPA){ // ToDo 3: Setter for GPA
        this.GPA = GPA;
    }

    @Override // ToDo 7: Add a toString method for Student class
    public String getAddress(){
        return null;
    }

    @Override // ToDo 7: Add a toString method for Student class
    public void setAddress(String address) {
    }

    @Override // ToDo 7: Add a toString method for Student class
    public String toString(){
        return "Student: " + getName() + ", Age: " + getAge() + ", GPA: " + GPA;
    }

}