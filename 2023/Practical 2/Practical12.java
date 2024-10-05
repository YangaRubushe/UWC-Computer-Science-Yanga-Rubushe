//Author: Yanga Rubushe

//Description: Question 2, File read write

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practical12 {
    public static void main(String[] args) {
        String inputFile = "Rhyme.txt";
        String outputFile = "Rhyme2.txt";
        String fullName = "Yanga Rubushe";
        String studentNumber = "4124888";

        try {
            // Create a new BufferedReader to read the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Create a new BufferedWriter to write the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));//Instruction 3

            String line;
            int verseNumber = 0;
            int lineNumber = 0;

            // Instruction 2: Loop through each line of the input file. 
            while ((line = reader.readLine()) != null) {
                // Instruction 4: Writing the line to the output file in the required format & displaying it
                writer.write("[" + verseNumber + "][" + lineNumber + "] " + line);
                writer.newLine();

                lineNumber++;

                // If the line is empty, increment the verse number and reset the line number
                if (line.isEmpty()) {
                    verseNumber++;
                    lineNumber = 1;
                }
            }

            // Instruction 5: Writing the full name and student number of the author at the end of the file
            writer.write("\nAuthor: "+ fullName + " " + studentNumber);

            reader.close();
            writer.close();

            System.out.println("File conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
