package com.student.factory;

import com.student.model.ExchangeStudent;
import com.student.model.RegularStudent;
import com.student.model.Student;

public class StudentFactory {

    public static Student createStudent(int type, String id, String name) {

        return switch (type) {
            case 1 -> new RegularStudent(id, name);
            case 2 -> new ExchangeStudent(id, name);
            default -> null;
        };
    }
}