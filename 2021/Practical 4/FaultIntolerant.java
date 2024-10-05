//Author: Yanga Rubushe

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FaultIntolerant {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            File file = new File("logfile.txt");
            Scanner scan = new Scanner(file);
            while((scan.hasNextLine())){
                String line = scan.nextLine();
                if(line.contains("ERROR")){
                     System.out.println(line);
                     break;
                }
            }
            
            
        } catch (Exception e) {
           System.out.println("Cannot find logfile!\nExiting..."); //TODO: handle exception
        }
    }
}
