//Author: Yanga Rubushe

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class cleanFile {

    static void norepetition(char[] remove, int n) {
        LinkedHashSet<Character> set = new LinkedHashSet<>(n);

        for (char x : remove) {
            set.add(x);  // Add characters without repetition
        }

        for (char x : set) {
            System.out.print(x);  // Print the unique characters
        }
        System.out.println();  // New line after printing characters
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data2.txt");
        Scanner fin = new Scanner(file);
        String text;

        while (fin.hasNextLine()) {  // Avoid reading past the last line
            text = fin.nextLine();
            String str = text.replaceAll("[^a-zA-Z]", "");  // Remove non-alphabetic characters
            char[] remove = str.toCharArray();
            int n = remove.length;
            norepetition(remove, n);  // Call the norepetition function
        }
        fin.close();
    }
}
