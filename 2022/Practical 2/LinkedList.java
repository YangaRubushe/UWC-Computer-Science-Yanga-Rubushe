//Author: Yanga Rubushe

/* This is a sample program to create 3 nodes and print  */

/* NB: Play around with the code, add more elements, delete elements and even try and create a new list with string elements etc. Your next prac will be on linked list */

public class LinkedList
{
    Node head;     // head of the linked list
    //LinkedList mylist = new LinkedList();

    /* Linked list Node. Note that inner class is made static for main() to be able to access it */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d; next=null;
        } // Constructor
    }
    /* method to create a simple linked list with 3 nodes*/
    public void printList()
    {
        Node current = head;
        while (current != null)    //checking to know that list is not empty
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args)
    {
        /* Start with an empty list. */
        LinkedList mylist = new LinkedList();
        mylist.head = new Node(16);
        Node second = new Node(19);
        Node third = new Node(22);
		/* Note: three nodes have been allocated dynamically.
		With references to these three blocks as first, second and third */
        // Link first node with the second node
        mylist.head.next = second;
        // Link second with third
        second.next = third;
        mylist.printList();    //calls the printList() method
    }

}