/*
*Student Surame: Rubushe
*Student Name: Yanga
*Student Number: 4142599
*2022 CSC211 Practical Assessment 1
*Node class
*/

public class Node {
    //Create your list of attributes/variables here

   
    public static final Node next = null;
    // public Node next;
   // public Node data;
    Citizen citizen;
    Node nextNode;
    public String data;
    public Object book;

    //Your default constructors goes here
    public Node(){
        
    
    }

    //Your accessors and mutators goes here
    /*
    EXAMPLE: Pls delete
    *************
    public int getSomething(){
        return idk;
    }

    public void setSomething(String newWord){
        oldWord = newWord;
    }
    **************
    */

    public Node(Book newBook) {
    }

    //Your toString() method goes here
    public String toString(){
        return "";
    }

    //Your main method goes here to test for class implementation
    public static void main(String[] args){
        System.out.println("Hello Students");
    }

    public Citizen getLast() {
        return null;
    }

    public Citizen getFirst() {
        return null;
    }

    public Book getBook() {
        return null;
    }

    public void setNextNode(Node currentNode) {
    }

    public Node getNextNode() {
        return null;
    }

    public void setBook(Book temp) {
    }
}
