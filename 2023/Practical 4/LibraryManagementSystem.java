/*
Student surname: Rubushe
Student first name: Yanga
File name: Library Management System
*/

import java.util.Scanner;

public class LibraryManagementSystem {
    private Node headNode; // head node of the linked list
    
    public LibraryManagementSystem() {
        headNode = null;
    }

    // Question 3.1
    public void insertBook(Book newBook) {
        Node newNode = new Node(newBook);

        if (headNode == null) {
            headNode = newNode;
        } else {
            Node currentNode = headNode;

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(newNode);
        }
    }

    // Question 3.2
    public void insertBefore(Book newBook, int bookID) {
        Node newNode = new Node(newBook);
        if (headNode == null) {
            System.out.println("Cannot insert before. The list is empty.");
            return;
        }
        Node currentNode = headNode;
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.getBook().getBookID() == bookID) {
                if (prevNode == null) {
                    headNode = newNode;
                } else {
                    prevNode.setNextNode(newNode);
                }
                newNode.setNextNode(currentNode);
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Cannot insert before. The book with ID " + bookID + " is not found.");
    }

    // Question 3.3
    public Book searchBook(int id) {
        Node current = headNode;
        while (current != null) {
            if (current.getBook() != null && current.getBook().getBookID() == id) {
                return current.getBook();
            }
            current = current.getNextNode();
        }
        return null;
    }

    // Question 3.4
    public void deleteBook(int bookID) {
        Node currentNode = headNode;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.getBook() != null && currentNode.getBook().getBookID() == bookID) {
                if (previousNode == null) {
                    headNode = currentNode.getNextNode();
                } else {
                    previousNode.setNextNode(currentNode.getNextNode());
                }
                System.out.println("Book deleted");
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        System.out.println("Book not found");
    }

    // Question 3.5
    public void listAllBooks() {
        if (headNode == null) {
            System.out.println("No books in the library");
        } else {
            Node currentNode = headNode;
            while (currentNode != null) {
                Book book = currentNode.getBook();
                if (book != null) {
                    System.out.println(book.toString());
                }

                currentNode = currentNode.getNextNode();
            }
        }
    }

    // Question 3.6
    public void sortLibrary() {
        Node currentNode = headNode;
        Node index;
        Book temp;
        if (headNode == null) {
            System.out.println("No books in the library to sort");
        } else {
            while (currentNode != null) {
                index = currentNode.getNextNode();
                while (index != null) {
                    if (currentNode.getBook().getBookID() > index.getBook().getBookID()) {
                        temp = currentNode.getBook();
                        currentNode.setBook(index.getBook());
                        index.setBook(temp);
                    }
                    index = index.getNextNode();
                }
                currentNode = currentNode.getNextNode();
            }
            System.out.println("Library sorted successfully");
        }
    }

    // Question 3.7
    public int totalBooks() {
        int count = 0;
        Node currentNode = headNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNextNode();
        }
        return count;
    }

    // Driver
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Welcome to the Library Management System.\n");
            System.out.println("1. Add book");
            System.out.println("2. Add book before a specific book ID");
            System.out.println("3. Search book by book ID");
            System.out.println("4. Delete book by book ID");
            System.out.println("5. List all books");
            System.out.println("6. Sort library by book ID");
            System.out.println("7. Count total books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Book newBook = new Book();
                    newBook.inputBookInfo();
                    library.insertBook(newBook);
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    Book newBookBefore = new Book();
                    newBookBefore.inputBookInfo();
                    System.out.print("Enter the book ID to insert before: ");
                    int bookID = scanner.nextInt();
                    library.insertBefore(newBookBefore, bookID);
                    break;
                case 3:
                    System.out.print("Enter book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found: ");
                        System.out.println(foundBook.toString());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter book ID to delete: ");
                    int deleteID = scanner.nextInt();
                    library.deleteBook(deleteID);
                    break;
                case 5:
                    library.listAllBooks();
                    break;
                case 6:
                    library.sortLibrary();
                    break;
                case 7:
                    int totalBooks = library.totalBooks();
                    System.out.println("Total number of books in the library: " + totalBooks);
                    break;
                case 0:
                    System.out.println("Exiting Library Management System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
