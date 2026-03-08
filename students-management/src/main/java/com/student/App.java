package com.student;

import java.util.Scanner;

import com.student.factory.StudentFactory;
import com.student.manager.StudentManager;
import com.student.model.Student;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = StudentManager.getInstance();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display Students");
            System.out.println("0. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    Student student = StudentFactory.createStudent(id, name);
                    manager.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter Student ID to update: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    manager.updateStudent(updateId, newName);
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = sc.nextLine();

                    manager.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();

                    Student s = manager.searchStudent(searchId);

                    if (s != null)
                        System.out.println(s.getInfo());
                    else
                        System.out.println("Student not found.");

                    break;

                case 5:
                    manager.displayStudents();
                    break;

                case 0:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}