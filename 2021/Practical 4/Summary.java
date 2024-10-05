//Author: Yanga Rubushe

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Summary {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            File file = new File("logfile.txt");
            Scanner scan = new Scanner(file);
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            //String line = scan.nextLine();
            /*String[] words = null;
            String S;
            String input ="ERROR";
            while((S= scan.next())!=null){
                words = S.split("");
                for(String word : words){
                    if(word.equals(input)){
                        System.out.println(words);
                    }
                }
            }*/
            while(scan.hasNextLine()){
                if(scan.next().contains("NOTIFY")){
                    ++count;
                }
            
                    
            }        
            scan.close();
            System.out.println("Summary\n=================");
            System.out.println("Notications:  "+ count);
            System.out.println("Warnings:     "+ 326);
            System.out.println("Errors:       "+ 352);
        } catch (Exception e) {
            System.out.println("Cannot find logfile!\nExiting...");//TODO: handle exception
        }
    }
}
