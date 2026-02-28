package com.student.factory;

import com.student.model.Student;

public class StudentFactory {

    // Factory Method
    public static Student createStudent(String id, String name) {
        return new Student(id, name);
    }
}