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

### 🔹 4.1 Singleton Pattern

**Class:** `StudentManager`

The Singleton pattern ensures that only one instance of `StudentManager` exists throughout the application.

Key characteristics:
- Private constructor
- Static instance variable
- Public static `getInstance()` method

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