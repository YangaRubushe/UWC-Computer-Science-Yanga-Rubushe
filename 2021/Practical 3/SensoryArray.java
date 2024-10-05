// Author: Yanga Rubushe

import java.util.Scanner;

public class SensoryArray {
    
    // Enum declaration for status codes
    enum Status {
        OPTIMAL, 
        SUBOPTIMAL, 
        CRITICAL, 
        UNKNOWN;
    }

    public static void main(String[] args) {
        // Create a 2D array to hold status codes
        byte[][] sensoryArray = new byte[3][5];   

        // Initialize the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to hold user input
        int message;

        // Prompt user for input
        System.out.println("Enter a sensor unit number to update or enter -1 to quit: ");
        
        // Read user input
        message = scan.nextInt();
        
        // Process user input based on sensor unit number
        switch (message) {
            case 0:
                System.out.println("Enter a list of 5 status codes for unit 0 (0-3): ");
                for (int i = 0; i < 5; i++) {
                    sensoryArray[0][i] = scan.nextByte(); // Store input in sensoryArray
                }
                break;

            case 1:
                System.out.println("Enter a list of 5 status codes for unit 1 (0-3): ");
                for (int i = 0; i < 5; i++) {
                    sensoryArray[1][i] = scan.nextByte(); // Store input in sensoryArray
                }
                break;

            case 2:
                System.out.println("Enter a list of 5 status codes for unit 2 (0-3): ");
                for (int i = 0; i < 5; i++) {
                    sensoryArray[2][i] = scan.nextByte(); // Store input in sensoryArray
                }
                break;

            case -1:
                // Display status for each unit based on stored codes
                System.out.println("Unit 0 status: " + getStatus(sensoryArray[0]));
                System.out.println("Unit 1 status: " + getStatus(sensoryArray[1]));
                System.out.println("Unit 2 status: " + getStatus(sensoryArray[2]));
                break;

            default:
                System.out.print("Unit number does not exist. Try again.");
                break;
        }

        // Close the Scanner to prevent resource leaks
        scan.close();
    }

    // Method to convert byte array of statuses into string representation
    private static String getStatus(byte[] statuses) {
        StringBuilder result = new StringBuilder();
        for (byte status : statuses) {
            switch (status) {
                case 0:
                    result.append(Status.OPTIMAL).append(" ");
                    break;
                case 1:
                    result.append(Status.SUBOPTIMAL).append(" ");
                    break;
                case 2:
                    result.append(Status.CRITICAL).append(" ");
                    break;
                default:
                    result.append(Status.UNKNOWN).append(" ");
                    break;
            }
        }
        return result.toString().trim(); // Remove trailing space
    }
}