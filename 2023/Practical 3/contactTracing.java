/*Author's Name & Surname: Yanga Rubushe 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class contactTracing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asking the user for the number of babies in the crèche.
        System.out.print("Please enter the number of babies in the crèche: ");
        int n = input.nextInt();
        
        // Initializing arrays to store arrival and departure times for each baby.
        ArrayList<Integer> time_arrivals = new ArrayList<>();
        ArrayList<Integer> time_departures = new ArrayList<>();
        
        // Asking the user for arrival and departure times for each baby. The user to insert the time for the departure should do spacing in the same line as arrivals
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter the arrival and departure times for baby " + (i + 1) + " (space separated): ");
            time_arrivals.add(input.nextInt());
            time_departures.add(input.nextInt());
        }

        System.out.println("\nThe distinct pairs of babies who are at the crèche simultaneously are: ");
        
        // Computing the number of distinct pairs of babies at the crèche simultaneously, using nested loops O(n^2)
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((time_arrivals.get(i) <= time_departures.get(j) && time_departures.get(i) >= time_arrivals.get(j))
                        || (time_arrivals.get(j) <= time_departures.get(i) && time_departures.get(j) >= time_arrivals.get(i))) {
                    count++;
                    System.out.println("(" + (i + 1) + ", " + (j + 1) + ")");
                }
            }
        }
        
        // Output the number of distinct pairs of babies at the crèche simultaneously
        System.out.println("The number of distinct pairs of babies at the crèche simultaneously is: " + count);
    }
}
