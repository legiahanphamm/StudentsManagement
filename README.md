# 📘 Student Management System  
**Software Architecture and Design Assignment**  
Design Patterns: Singleton Pattern & Factory Pattern

---

## 📌 1. Introduction

This project is a simple **Student Management System** developed to demonstrate the implementation of two important design patterns:

- **Singleton Pattern** – Ensures only one instance of the student manager exists.
- **Factory Pattern** – Provides a centralized way to create Student objects without directly calling constructors.

The main objective is to apply software architecture and design principles to improve:

- Maintainability  
- Scalability  
- Code organization  
- Low coupling  

---

## 🏗 2. Technologies Used

- Java 17+
- Maven
- Visual Studio Code
- UML Class Diagram

---

## 📂 3. Project Structure

student-management  
│── pom.xml  
└── src  
&nbsp;&nbsp;&nbsp;&nbsp;└── main  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── java  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── com.student  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── model  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── Student.java  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── factory  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── StudentFactory.java  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── manager  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── StudentManager.java  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── App.java  

---

## 🎯 4. Design Patterns Implementation

## 🔹 4.1 Singleton Pattern

**Class:** `StudentManager`

The **Singleton Pattern** ensures that only **one instance** of the `StudentManager` class exists throughout the application.  
This instance is responsible for managing the list of students in the system.

### Key Characteristics

- **Private constructor** to prevent direct object creation.
- **Static instance variable** to store the single instance.
- **Public static `getInstance()` method** to provide global access to that instance.

### Example

```java
public class StudentManager {

    private static StudentManager instance;

    private StudentManager() {}

    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }
}
```

## 🔹 4.2 Factory Pattern

**Class:** `StudentFactory`

The **Factory Pattern** is used to create `Student` objects without directly calling the constructor in the main program.  
Instead, a dedicated factory class (`StudentFactory`) handles the creation logic.

This approach centralizes object creation and makes the system easier to maintain and extend.

---

### How It Works

When the user selects **Add Student** from the console menu, the program calls the factory method to create the appropriate student object.

Example flow:

User → Menu → `StudentFactory.createStudent()` → `Student` object → `StudentManager`

---

### Example

```java
public class StudentFactory {

    public static Student createStudent(int type, String id, String name) {

        switch (type) {

            case 1:
                return new RegularStudent(id, name);

            case 2:
                return new ExchangeStudent(id, name);

            default:
                return null;
        }
    }
}