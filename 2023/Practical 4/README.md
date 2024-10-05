# Library Management System

This is a Java-based console application that simulates a simple Library Management System using a linked list to store, manage, and perform operations on books. The system allows users to add, search, delete, and sort books by their unique `bookID`. It also provides features to insert a book before a specific `bookID` and list the total number of books available in the library.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
- [Project Structure](#project-structure)
- [License](#license)

## Features

1. **Add Book**: Add a new book to the library.
2. **Insert Book Before a Specific Book**: Add a book before a specific `bookID`.
3. **Search Book**: Search for a book by its `bookID`.
4. **Delete Book**: Remove a book by its `bookID`.
5. **List All Books**: Display all books in the library.
6. **Sort Books**: Sort books by `bookID` in ascending order.
7. **Total Books**: Count the total number of books in the library.
8. **Exit**: Exit the program.

## Installation

### Prerequisites
Ensure you have the following installed on your system:

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt to run the Java program

### Steps

1. Clone this repository:
   ```bash
   git clone https://github.com/YangaRubushe/LibraryManagementSystem.git
   ```

2. Navigate into the project directory:
   ```bash
   cd library-management-system
   ```

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the program:
   ```bash
   java LibraryManagementSystem
   ```

## Usage

Once the program is started, you will be presented with a menu of options to manage the library. Enter the corresponding number to perform the desired operation. For example:

1. **Add Book**: 
   - The program will prompt you to enter the book's title, author, publisher, and `bookID`.
   
2. **Search Book**: 
   - Enter the `bookID` of the book you want to search for.
   
3. **List All Books**: 
   - Displays all the books currently in the library.
   
4. **Sort Books**: 
   - Sorts all the books by `bookID`.

To exit the system, simply choose the **Exit** option from the menu.

### Sample Menu
```text
Welcome to the Library Management System.

1. Add book
2. Add book before a specific book ID
3. Search book by book ID
4. Delete book by book ID
5. List all books
6. Sort library by book ID
7. Count total books
0. Exit
Enter your choice:
```

## Classes Overview

1. **`Book`**: 
   - Represents a book with attributes like `title`, `author`, `publisher`, and `bookID`. 
   - Provides methods for user input and book information handling.

2. **`Node`**: 
   - Represents a node in the linked list that holds a `Book` object.
   - Contains methods to get and set the next node in the list.

3. **`LibraryManagementSystem`**: 
   - Manages the operations of adding, searching, deleting, and sorting books using a linked list.
   - Provides the user interface (console-based) for interacting with the library.

- **Book.java**: The class representing a book.
- **LibraryManagementSystem.java**: The main class where the application logic resides.
- **Node.java**: The class representing each node in the linked list.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Author

This project was developed by Yanga Rubushe as part of an assignment to demonstrate a basic understanding of linked lists and Java data structures.