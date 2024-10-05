// Surname: Rubushe
// Name: Yanga
// Year: 2023 
// Assignment: Practical 2 Term 2
// File: Main.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<FlightNode> flights = new PriorityQueue<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yanga\\Downloads\\planes.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String reg = parts[0];
                Date dep = format(parts[1]);
                Date arr = format(parts[2]);
                if (dep == null || arr == null) {
                    continue; // skip flights with missing date fields
                }
                flights.add(new FlightNode(reg, dep, arr));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (!flights.isEmpty()) {
            System.out.println(flights.poll());
        }
    }

    public static Date format(String date) {
        String[] parts = date.split(" ");
        if (parts.length < 2) {
            return null; // return null if date is missing
        }
        String[] dateParts = parts[0].split("/");
        String[] timeParts = parts[1].split(":");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]) - 1; // Month is 0-based in Date
        int year = Integer.parseInt(dateParts[2]) - 1900;
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        return new Date(year, month, day, hours, minutes, seconds);
    }
}