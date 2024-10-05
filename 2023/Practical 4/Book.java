/*
Student surname: Rubushe
Student first name: Yanga
File Name: Book
*/

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int bookID;

    public Book(String title, String author, String publisher, int bookID) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.bookID = bookID;
    }

    public Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.bookID = 0;
    }

    public void inputBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Please Enter Book Information Below*****");
        System.out.print("Enter the book's title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter the book's author: ");
        this.author = scanner.nextLine();
        System.out.print("Enter the book's publisher: ");
        this.publisher = scanner.nextLine();
        System.out.print("Enter the book's ID: ");
        this.bookID = scanner.nextInt();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", bookID=" + bookID +
                '}';
    }
}
