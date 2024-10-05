//Author: Yanga Rubushe 

//TASK 1: COUNTDOWN
import java.util.Scanner;
public class Countdown {
    public static void main(String[] args){
        System.out.println("Enter the countdown parameters from <start> <decrement>: ");
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("Countdown begins.");
        int i = num1;
        while( i >= 1){
            
            if( num2>=1){
            System.out.println(i);
            i= i - num2;
            
         }else{
            System.out.print("Invalid countdown parameters.");
            break;
        
         }
        }  
        System.out.println("Countdown complete.");
        
    }    
}
