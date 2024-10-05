//Author: Yanga Rubushe
/**
 * The Drone class represents a simple console application that performs
 * several tasks related to user interaction and geographic coordinate conversion.
 * 
 * The program does the following:
 * 1. Greets the user and prompts them to enter a message, which it then echoes back.
 * 2. Asks the user for a passphrase and checks it against a predefined secret phrase
 *    to authenticate the user.
 * 3. Requests geographic coordinates in Degrees, Minutes, Seconds (DMS) format from
 *    the user and converts these coordinates into decimal degrees.
 * 
 * This application demonstrates basic Java programming concepts such as input handling,
 * conditional statements, and mathematical operations.
 */
import java.util.Scanner; // Import the Scanner class for user input

public class Drone {
    // Define a constant for the secret passphrase
    public static final String SECRET_PHRASE = "5ky-N3t";

    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Greet the user
        System.out.println("Welcome to Control Operation System (COS 101)!");

        // Create a single Scanner instance for reading input
        Scanner scan = new Scanner(System.in); 

        // TASK 1: Echo
        System.out.println("Please enter a message to repeat: ");
        String message = scan.nextLine(); // Read user input
        System.out.println(message); // Echo the message back to the user
        
        // TASK 2: AUTHENTICATE
        System.out.println("Enter passphrase: ");
        String passphrase = scan.nextLine(); // Read the passphrase input
        // Check if the entered passphrase matches the secret phrase
        if (passphrase.equals(SECRET_PHRASE)) {
            System.out.println("Authenticated."); // Successful authentication message
        } else {
            System.out.println("Passphrase not recognized!"); // Failed authentication message
        }
        
        // TASK 3: Locate
        System.out.println("Enter a longitude or latitude in the DMS format: ");
        
        // Read three integers representing degrees, minutes, and seconds
        int n1 = scan.nextInt(); // Degrees
        int n2 = scan.nextInt(); // Minutes
        int n3 = scan.nextInt(); // Seconds
        
        // Convert DMS to decimal degrees using proper float division
        Float decimalDegree = (n1 + n2 / 60.0f + n3 / 3600.0f);
        
        // Output the converted decimal degree value
        System.out.println("DMS to decimal is: " + decimalDegree);
        
        // Close the Scanner to prevent resource leaks
        scan.close(); 
    }  
}