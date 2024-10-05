# CleanFile, MyFriends, and RemoveDuplicate Projects

## Overview

This directory contains three Java programs focusing on string processing, student management, and file cleaning operations. Each program demonstrates fundamental concepts in computer science, including **Object-Oriented Programming (OOP)**, **data structures**, **file handling**, and **string manipulation**.

## Programs

### 1. `CleanFile.java`

**Purpose**:  
`CleanFile` reads a text file, removes non-alphabetic characters, and eliminates duplicate characters using a `LinkedHashSet`. It helps clean the file content and present it in a filtered, non-repetitive format.

**How It Works**:
- Reads the file from a specific directory (`data1.txt`).
- Replaces non-alphabetic characters and removes duplicates from the content.
- Outputs the cleaned, unique characters in the order they first appeared.

### 2. `MyFriends.java`

**Purpose**:  
`MyFriends` allows the user to input the number of students they wish to manage and evaluates whether they have a diverse range of "friends." It’s a simple student management program that introduces basic user interaction and decision-making.

**How It Works**:
- Takes user input for the number of students.
- Outputs different messages depending on the number of students entered.
- Uses a simple if-else control flow to guide responses based on the user input.

### 3. `RemoveDuplicate.java`

**Purpose**:  
`RemoveDuplicate` processes a text file by removing non-alphabetical characters and eliminating duplicates. It further demonstrates string handling and file manipulation techniques in Java.

**How It Works**:
- Reads a file, strips non-alphabetical characters, and removes duplicate characters from each line.
- Outputs the cleaned and unique characters for each line read.

### 4. `Student.java`

**Purpose**:  
Defines a `Student` class that represents student information, including name, student number, registration year, faculty, and department. It uses getters and setters to manage student data and demonstrates **OOP** principles.

---

## How to Run

### Prerequisites
- You need Java installed on your machine.
- Ensure that the required text files (e.g., `data1.txt`, `data2.txt`) are present in the appropriate directory as referenced in the code.

### Compilation and Execution
1. Compile the Java files using `javac`:
   ```bash
   javac CleanFile.java
   javac MyFriends.java
   javac RemoveDuplicate.java
   javac Student.java
   ```

2. Run the programs:
   ```bash
   java CleanFile
   java MyFriends
   java RemoveDuplicate
   ```

---

## Summary of Topics

### 1. **Object-Oriented Programming (OOP)**
   - The `Student.java` class demonstrates the use of encapsulation through private fields and public getter/setter methods.
   - OOP is also present in the design of reusable methods across the programs.

### 2. **Data Structures**
   - **ArrayList**: In `MyFriends.java`, arrays are used to store student objects.
   - **LinkedHashSet**: In `CleanFile.java`, a `LinkedHashSet` is used to remove duplicates while preserving the order of characters.

### 3. **File Handling and I/O Operations**
   - The programs read from files using the `Scanner` class (`CleanFile.java` and `RemoveDuplicate.java`).
   - I/O operations are critical in reading the content of text files and processing them.

### 4. **Error Handling and Exception Management**
   - Basic error handling is implemented using try-catch blocks to handle file-related exceptions and ensure the program doesn't crash unexpectedly.

### 5. **Recursion and Control Flow**
   - The programs use iterative control structures such as loops and conditional statements (e.g., if-else) to process input and file content.

### 6. **Interfaces and Abstraction**
   - Although interfaces are not explicitly used, abstraction is demonstrated in how each class and method focuses on a specific task.

### 7. **Software Design Patterns**
   - The **Singleton Pattern** can be inferred through the static methods used to manage data and student information in the `MyFriends.java` program.

### 8. **Enums (Enumerated Types)**
   - In other parts of the project (e.g., `VaccineRecord` in previous codes), **Enums** are used to define sets of constants such as vaccine types.

---

## Notes
- Modify the file paths in the code to match your environment.
- Be sure to place the text files (`data1.txt`, `data2.txt`) in the correct directory to avoid file not found errors.
