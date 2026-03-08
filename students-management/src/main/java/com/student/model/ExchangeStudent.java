package com.student.model;

public class ExchangeStudent extends Student {

    public ExchangeStudent(String id, String name) {
        super(id, name);
    }

    @Override
    public String getInfo() {
        return "Exchange Student | ID: " + id + " | Name: " + name;
    }
}