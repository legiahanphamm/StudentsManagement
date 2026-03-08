package com.student.model;

public class RegularStudent extends Student {

    public RegularStudent(String id, String name) {
        super(id, name);
    }

    @Override
    public String getInfo() {
        return "Regular Student | ID: " + id + " | Name: " + name;
    }
}