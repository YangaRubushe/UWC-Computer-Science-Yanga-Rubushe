import java.util.Scanner;
import java.util.LinkedList;

/*
*Student Surame: Rubushe
*Student Name: Yanga
*Student Number: 4142599
*2022 CSC211 Practical Assessment 1
*CitizenRegister class
*/

public class CitizenRegister {
    //Create your list of attributes/variables here
    private Node headNode;
    //Node head;
    private Node tail;
    private int totalRegisteredCitizens;
    //Your default constructors goes here
    public CitizenRegister(){

        
    }

    //Your accessors and mutators goes here
    
    public Node getheadNode(){
        return headNode;
    }

    public void setheadNode(Node newWord){
        this.headNode = newWord;
    }

    public Node gettail(){
        return tail;
    }
    public void settail() {
        this.tail = tail;
    }

    public int settotalRegisteredCitizens() {
        return totalRegisteredCitizens;
    }

    public void gettotalRegisteredCitizens(){
        this.totalRegisteredCitizens = totalRegisteredCitizens;
    }
    

    //Your Question 4 methods are here:
    //4a
    public Citizen head(){
        return headNode.getFirst();
    }
    //4b
    public Citizen tail(){
        return tail.getLast();
    }
    //4c
    public int size(int totalRegisteredCitizen){
        return totalRegisteredCitizens;
    }
    //4d
    public boolean isEmpty(){
       Node newNode = new Node();
        if (headNode == null) {
            headNode = newNode;
            
        }
       /* Node empty = head;
        if(empty == null){
            return;
        }*/
        return false;
    }

   //4e
    public void addCitizenAtHead(Node newNode){
         newNode = new Node();
        newNode.nextNode = headNode.nextNode;

    }

    //4f
    public void addCitizenAtTail(Node newNode){
        Node new_Node = new Node();
        new_Node.nextNode = newNode;
        new_Node.nextNode = null;
        if (headNode == null){
            headNode = new_Node;
        }else{
            Node citizen = new Node();
            citizen = headNode;
            while (citizen.nextNode != null) {
                citizen = (Node) citizen.nextNode;
                citizen.nextNode = new_Node;
            }
        }



    }
    //4g
    public void addCitizenBefore(String citizenID, Node newNode) {
        Node citizen;
        if (newNode == null){
            newNode = new Node(citizenID);
            System.out.println("Citizen has not registered for vaccine");
        }else {
            citizen = newNode;
            while (Citizen.nextNode != null) {
                citizen = citizen.nextNode;
            }
            citizen.nextNode = new Node(citizenID);
        }
    }
    //4h
    public void addCitizenAfter(String citizenID, Node newNode) {
        Node citizen;
        if (newNode == null){
            newNode = new Node(citizenID);
            System.out.println("Citizen has not registered for vaccine");
        }else {
            citizen = newNode;
            while (citizen.nextNode != null) {
                citizen = citizen.nextNode;
            }
            citizen.nextNode = new Node(citizenID);
        }
    }
    //4i
    public void removeCitizen(String citizenID){
       if (headNode == null) {
           return;
       }
       Node cities = headNode;

       if (citizenID == null) {
           headNode = cities.nextNode;
           System.out.println("Citizen has not registered for vaccine");
       }
    }
    //4j
    public void removeLastCitizen(){
         Node citizen = headNode;
         while (citizen.nextNode != null) {
             citizen = citizen.nextNode;
         }
         citizen.nextNode = null;

    }
    //4k 
    public void removeFirstCitizen(){
        if (headNode == null){
            return;
        }
        headNode = headNode.nextNode;
        return ;
    }
    //4I
    public void displayAllCitizens(){
        Node cities = headNode;
        while (cities != null) {
            System.out.print(cities.data + " ");
            cities = cities.nextNode;
        }
    }

    //Your main method goes here to test for class implementation
    public static void main(String[] args){
        LinkedList linkedListInfo = new LinkedList();
        System.out.println("Welcome to the Covid vaccine registration program.\nEnter number for various menu options: \n1   Show the first citizen registered\n2   Show the last citizen registered\n3   Show the total amount of citizen registered\n4   Show whether the list is empty\n5   Add a citizen in front of the list\n6   Add a citizen at the end of the list\n7   Add citizen before a given ID\n8   Add citizen after a given ID\n9   Remove citizen with the given ID\n10   Remove last citizen\n11   Remove first citizen\n12   Show all citizens in list\n13+   Any other integers to Quit.");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println(linkedListInfo.getFirst());
                break;
            case 2:
                System.out.println(linkedListInfo.getLast());
                break;
            case 3:
                System.out.println("5");
                break;
            case 4:
                System.out.println("empty");
                break;
            case 5:
            System.out.print("Enter citizen info in the following format: \n");
            System.out.print("citizenID,citizenName,citizenSurname,citizenCellNumber,registrationDay,registrationMonth,registrationYear");
            int no1 = scan.nextInt(); String no2 =scan.next(); String no3 =scan.next(); int no4 =scan.nextInt(); int no5 =scan.nextInt(); int no6 =scan.nextInt();int no7 =scan.nextInt();
            linkedListInfo.add(no1);
            linkedListInfo.add(no2);
            linkedListInfo.add(no3);
            linkedListInfo.add(no4);
            linkedListInfo.add(no5);
            linkedListInfo.add(no6);
            linkedListInfo.add(no7);

    
                break;
            case 6:
            System.out.print("Enter citizen info in the following format: \n");
            System.out.print("citizenID,citizenName,citizenSurname,citizenCellNumber,registrationDay,registrationMonth,registrationYear");
            int no8 = scan.nextInt(); String no9 =scan.next(); String no10 =scan.next(); int no11 =scan.nextInt(); int no12 =scan.nextInt(); int no13 =scan.nextInt();int no14 =scan.nextInt();
            linkedListInfo.add(no8);
            linkedListInfo.add(no9);
            linkedListInfo.add(no10);
            linkedListInfo.add(no11);
            linkedListInfo.add(no12);
            linkedListInfo.add(no13);
            linkedListInfo.add(no14);
                break;
            case 7:
            System.out.print("Enter citizen ID: \n");
             String citizenID = scan.next();
             linkedListInfo.add(citizenID);
                break;
            case 8:
            System.out.print("Enter citizen ID: \n");
            String citizenID2 = scan.next();
            linkedListInfo.add(citizenID2);
                break;
            case 9:
                String str = (String) linkedListInfo.removeLast();
                break;
            case 10:
            String str1 = (String) linkedListInfo.removeLast();
                break;
            case 11:
            String str2 = (String) linkedListInfo.removeFirst();
                break;
            case 12:
                System.out.println(linkedListInfo);
                break;
            case 13:
                System.out.print("Program terminated due to invalid input. Thanks for using our system.");
                break;
        
            
            default:
            System.out.print("Program terminated due to invalid input. Thanks for using our system.");
                break;
        }
    }
}
