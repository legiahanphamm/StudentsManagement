package com.student;

import com.student.factory.StudentFactory;
import com.student.manager.StudentManager;
import com.student.model.Student;

public class App {
    public static void main(String[] args) {

        // Create students using Factory
        Student s1 = StudentFactory.createStudent("S01", "John");
        Student s2 = StudentFactory.createStudent("S02", "Anna");

        // Get Singleton instance
        StudentManager manager = StudentManager.getInstance();

        // Add students
        manager.addStudent(s1);
        manager.addStudent(s2);

        // Display students
        manager.displayStudents();
    }
}