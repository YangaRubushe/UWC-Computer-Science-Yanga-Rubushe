//Author: Yanga Rubushe

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Display {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Enter a start and end index separated by a space:");
        Scanner scan = new Scanner(System.in);
        File file = new File("logfile.txt");
        int num1,num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        //String text;
        try {
            String text;
            //File file = new File("/Users/yanga/OneDrive/Desktop/logfile.txt");
            Scanner fin = new Scanner(file);
            int i = 0;
             while(((text= fin.nextLine()) !=null) && i <= num2 ){
                if( 0<=num1 && num1<=num2 ){
                System.out.println(text);
                i++;
                }
                
                
            }
            fin.close();
            //System.out.println(text);
        } catch (Exception e) {
            System.out.println("Cannot find logfile!\n Exiting...");
        }
    }
}
