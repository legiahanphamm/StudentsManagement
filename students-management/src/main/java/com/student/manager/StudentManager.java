package com.student.manager;

import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class StudentManager {

    private static StudentManager instance;
    private List<Student> studentList;

    private StudentManager() {
        studentList = new ArrayList<>();
    }

    public static StudentManager getInstance() {

        if (instance == null) {
            instance = new StudentManager();
        }

        return instance;
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void displayStudents() {

        if (studentList.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        for (Student s : studentList) {
            System.out.println(s.getInfo());
        }
    }

    public Student searchStudent(String id) {

        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id))
                return s;
        }

        return null;
    }

    public void deleteStudent(String id) {

        Student s = searchStudent(id);

        if (s != null) {
            studentList.remove(s);
            System.out.println("Deleted!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(String id, String newName) {

        Student s = searchStudent(id);

        if (s != null) {
            s.setName(newName);
            System.out.println("Updated!");
        } else {
            System.out.println("Student not found.");
        }
    }
}