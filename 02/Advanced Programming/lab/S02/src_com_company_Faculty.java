package com.company;

import java.util.ArrayList;
/**
 * The Faculty class represents a set of labs, the supergroup of all students in a student
 * administration system.

 *
 * @author bardia
 * @version 0.0
 */
public class Faculty {
    private ArrayList<Student> students;
    private ArrayList<Lab> labs;
    private final String facultyName;

    /**
     * Constructor for faculty
     * @param name sets the name of the faculty, used in print
     */
    public Faculty(final String name) {
        labs = new ArrayList<>();
        students = new ArrayList<>();
        this.facultyName=name;
    }

    /**
     * adds a lab to this faculty.
     * @param l the lab that you want to add to this faculty
     */
    void addLab(final Lab l) {
        labs.add(l);
    }

    /**
     * Adds a student to this faculty.
     * @param s The student you want to add to faculty.
     */
    void addStudent(final Student s) {
        students.add(s);
    }

    /**
     * Removes a lab from the faculty
     * @param l The lab that you want to remove from your faculty
     */
    void removeLab(final Lab l) {
        labs.remove(l);
    }
    /**
     * Removes a student from the faculty
     * @param s The student that you want to remove from your faculty
     */
    void removeStudent(final Student s) {
        students.remove(s);

    }


    /**
     * getter for students array list
     * @return students field
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Setter for students, use if you have array
     * note that this clones the students, making it call by value
     * @param students student arraylist which you want to set in faculty, CALL BY VALUE!
     */

    public void setStudents(final ArrayList<Student> students) {
        this.students = (ArrayList<Student>) students.clone();
    }
    /**
     * getter for arraylist of labs
     * @return labs arraylist
     */
    public ArrayList<Lab> getLabs() {
        return labs;
    }
    /**
     * Setter for labs, use if you have array
     * note that this clones the labs, making it call by value
     * @param labs labs arraylist which you want to set in faculty, CALL BY VALUE!
     */
    public void setLabs(final ArrayList<Lab> labs) {
        this.labs = (ArrayList<Lab>) labs.clone();
    }

    /**
     * prints the whole faculty, including its students, labs, and professors
     */
    public void print() {
        System.out.println("Faculty : "+facultyName);
        System.out.println("STUDENTS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (final Student std : students) {
            std.print();
        }
        System.out.println();
        System.out.println("LABS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (final Lab l : labs) {
            l.print();
        }
    }
}
