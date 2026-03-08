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

            System.out.println("\n===== STUDENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("1. Regular Student");
                    System.out.println("2. Exchange Student");

                    System.out.print("Select type: ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Student s = StudentFactory.createStudent(type, id, name);

                    manager.addStudent(s);

                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    String searchId = sc.nextLine();

                    Student found = manager.searchStudent(searchId);

                    if (found != null)
                        System.out.println(found.getInfo());
                    else
                        System.out.println("Not found");

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    manager.updateStudent(updateId, newName);

                    break;

                case 5:

                    System.out.print("Enter ID: ");
                    String deleteId = sc.nextLine();

                    manager.deleteStudent(deleteId);

                    break;

                case 0:
                    return;
            }
        }
    }
}