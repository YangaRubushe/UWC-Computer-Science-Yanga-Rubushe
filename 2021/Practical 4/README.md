# Logfile Analyzer

## Project Overview
The **Logfile Analyzer** project processes log files and performs various tasks, such as displaying specific lines from the log, identifying errors, and summarizing notifications, warnings, and errors. It contains three Java classes that handle different functionalities:

1. **Display.java**: Displays lines from the log file within a specified range.
2. **FaultIntolerant.java**: Detects and outputs the first line containing an error from the log file.
3. **Summary.java**: Counts and summarizes the number of notifications, warnings, and errors in the log file.

## Features
- **Display Specific Lines**: Displays the content between a start and end index from a log file.
- **Error Detection**: Searches for and displays the first error line in the log file.
- **Log Summary**: Counts and displays the number of notifications, warnings, and errors found in the log file.

## Class Descriptions

### 1. Display.java
This class allows the user to specify a range (start and end index) and displays lines from the log file within that range.

#### Methods:
- `main`: Prompts the user to input a start and end index, then reads and displays lines from the log file within that range.

### 2. FaultIntolerant.java
This class reads the log file and prints the first line that contains the word "ERROR." It stops once the first error is found.

#### Methods:
- `main`: Reads through the log file line by line and prints the first error.

### 3. Summary.java
This class analyzes the log file and counts the occurrences of "NOTIFY" messages. It also provides a summary, including the number of notifications, warnings, and errors.

#### Methods:
- `main`: Counts occurrences of the word "NOTIFY" and outputs a summary with predefined counts for warnings and errors.

## Prerequisites
- Java Development Kit (JDK)
- A log file named `logfile.txt` in the root directory where the application is executed.

## How to Run

1. **Compile the Java files**:
   ```bash
   javac Display.java FaultIntolerant.java Summary.java
