//Author: Yanga Rubushe
/
//Description: Question 1, Valid UWC account password.

import java.util.Scanner; 

public class Practical11 {
    public static boolean verifyPassword(String password) {
        boolean isValid = true; // Assuming the password is valid by default
        String invalidReasons = ""; // Initialize a string to store invalid reasons by making empty string

        // Checking if the password is at least 8 characters longer or not
        if (password.length() < 8) {
            isValid = false; // If not, the password is invalid
            invalidReasons += "Password must be at least 8 characters long.\n"; // Adding the reason for the invalidity
        }

        // Counting the password's capital, lowercase, digit, and special characters.
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (!Character.isWhitespace(c)) { // Special characters are characters that are not whitespace
                specialCount++;
            }
        }

        // confirming that the password has at least one lowercase letter
        if (lowercaseCount < 1) {
            isValid = false;
            invalidReasons += "Password must contain at least 1 lowercase letter.\n";
        }

        // confirming that the password has at least one uppercase letter
        if (uppercaseCount < 1) {
            isValid = false;
            invalidReasons += "Password must contain at least 1 uppercase letter.\n";
        }

        // confirming that the password has at least one digit
        if (digitCount < 1) {
            isValid = false;
            invalidReasons += "Password must contain at least 1 digit.\n";
        }

        // confirming that the password has at least one special character
        if (specialCount < 1) {
            isValid = false;
            invalidReasons += "Password must contain at least 1 special character.\n";
        }

        // Printing whether the password is valid or not, along with the reasons for invalidity (if any)
        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password. Reasons:");
            System.out.println(invalidReasons);
        }

        return isValid; // Return whether the password is valid or not
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a new Scanner object to read input from the user
        System.out.print("Please enter the password: ");
        String password = scan.nextLine(); 
        verifyPassword(password); 
    }
}
