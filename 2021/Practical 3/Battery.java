//Author: Yanga Rubushe

import java.util.Scanner;
public class Battery {
    public static final int MAX_BATTERY_CAPACITY = 60;
    public static void main(String[] args){
        System.out.print("Enter the initial battery levels separated by a space: " +"\n" );
        Scanner scan = new Scanner(System.in);
        int battery1,battery2,battery3; 
        battery1 = scan.nextInt();
        battery2 = scan.nextInt();
        battery3 = scan.nextInt();
        int[] Battery = { battery1, battery2, battery3};
        
        //int[] Battery = new int[3];
        System.out.println("Enter number of days to wait: ");
        int day = scan.nextInt();
        System.out.println("Battery levels are:");
        for (int B : Battery){
            double answer = (B-day);
            double div = (MAX_BATTERY_CAPACITY*0.01);
            double battery = (answer/div);
            if(battery<0){
               battery = 0;
               System.out.println( battery+ "%");
            }else{ 
            System.out.println( battery+ "%");
            }    
        }

        
    
    }

}

    
 





