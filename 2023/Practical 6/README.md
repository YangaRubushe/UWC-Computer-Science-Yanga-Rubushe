# Flight Management System

This project implements a simple flight management system using Java. The system allows users to read flight data from a CSV file, display specific lines from the file, and manage flight information using a priority queue.

## File Descriptions

### 1. `Main.java`
This file contains the `Main` class, which serves as the entry point for the application. It reads flight data from a specified CSV file and populates a priority queue with `FlightNode` objects. Each flight is represented by its registration number, departure date, and arrival date. The program processes the CSV file line by line, formats the date information, and adds valid flights to the queue. Finally, it prints out the details of each flight in order of arrival.

### 2. `Display.java`
The `Display` class is responsible for reading a specified range of lines from a CSV file. It prompts the user to input two integers, which represent the starting and ending line numbers. The program then reads the file and prints the lines within the specified range. This is useful for quickly viewing a subset of flight data without loading the entire file.

### 3. `CSVReader.java`
This file contains a placeholder `CSVReader` class. Currently, it has a method `readNext()` that returns `null`. This class is intended to be implemented for reading CSV data more effectively. You can enhance this class to parse CSV files and return the next line of data as an array of strings.

### 4. `FlightNode.java`
The `FlightNode` class represents a single flight in the system. It includes attributes for the flight's registration number, departure date, and arrival date. The class provides a constructor for initializing these attributes, along with getter methods to access them. It implements the `Comparable` interface, allowing flights to be compared based on their arrival dates, which is essential for managing the priority queue. The `toString()` method formats the flight information for easy display.

## Usage
To run the program, compile the Java files and execute the `Main` class. Ensure that the CSV file containing flight data is correctly formatted and located at the specified path.

## Requirements
- Java Development Kit (JDK) 8 or higher

## Author
- Yanga Rubushe