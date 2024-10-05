//Author: Yanga Rubushe

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

    static void norepetition(char[] str, int length) {
        int index = 0;

        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];  // Add character to the result if not repeated
            }
        }

        System.out.println(String.valueOf(Arrays.copyOf(str, index)));  // Print the unique string
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data2.txt");
        Scanner fin = new Scanner(file);
        String text;

        while (fin.hasNextLine()) {  // Properly iterate over file lines
            text = fin.nextLine();
            String yr = text.replaceAll("[^a-zA-Z]", "");  // Remove non-alphabetic characters
            System.out.println(yr);  // Print the cleaned string

            char[] str = yr.toCharArray();
            int len = str.length;
            norepetition(str, len);  // Call norepetition to remove duplicates
        }

        fin.close();
    }
}
