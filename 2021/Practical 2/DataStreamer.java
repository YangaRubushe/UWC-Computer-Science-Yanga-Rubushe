//Author: YANGA RUBUSHE

import java.util.Scanner;
public class DataStreamer {
    public static final byte MAX_MESSAGE_SIZE = 16;
    public static void main(String[] args){
        
        System.out.println("Add a message to store on the satellite:");
        String message;
        Scanner scan = new Scanner(System.in);
        message = scan.nextLine();
        while(message.length()<MAX_MESSAGE_SIZE){
          System.out.print("Add a message to store on the satellite:" + "\n");
          message = scan.nextLine();
        }
        System.out.println("Message stored.Memory contains:");
        String stored = message.substring(0,MAX_MESSAGE_SIZE); 
        System.out.println(stored);
         
       //TASK 3: 
       System.out.println("Enter an encoding key (1-127):");
       int key;
       key = scan.nextInt();
       String myByte =  message.substring(0,MAX_MESSAGE_SIZE+1);
       System.out.println("Begin encoded byte transmission:");
       for( byte a: myByte.getBytes()){
        
         System.out.println(a%key);
        } 
      System.out.println("End of transmission.");
    }
}
