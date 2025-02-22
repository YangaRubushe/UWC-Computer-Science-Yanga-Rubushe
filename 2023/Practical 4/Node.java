/*
Student surname: Rubushe
Student first name: Yanga
File Name: Node
*/

public class Node {
    private Book book;
    private Node nextNode;

    public Node(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "book=" + book +
                '}';
    }
}
