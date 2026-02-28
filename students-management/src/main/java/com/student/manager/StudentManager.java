package com.student.manager;

import com.student.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // Singleton instance
    private static StudentManager instance;

    private List<Student> studentList;

    // Private constructor
    private StudentManager() {
        studentList = new ArrayList<>();
    }

    // Get instance
    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        System.out.println("List of students:");
        for (Student s : studentList) {
            System.out.println(s.getInfo());
        }
    }
}